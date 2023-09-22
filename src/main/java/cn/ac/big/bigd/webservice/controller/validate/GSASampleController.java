package cn.ac.big.bigd.webservice.controller.validate;

import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.SampleMapper;
import cn.ac.big.bigd.webservice.send.SendEmail;
import cn.ac.big.bigd.webservice.utility.HttpRequestUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * author chenxu
 */
@RestController
public class GSASampleController {

    @Autowired
    private GsaMapper gsaMapper;

    @Autowired
    private SampleMapper sampleMapper;


    /**
     * 通过sample的批量提交编号submissionId获取是否关联其他系统，返回是否可以删除
     * 0可以删除，1不可以删除
     */
    @RequestMapping(value = "/gsaSampleDeleteValidateList/{submissionId}")
    public int gsaSampleDeleteValidateList(HttpServletResponse httpServletResponse,@PathVariable("submissionId") String submissionId) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        int res = 0;
        String accession = this.sampleMapper.getSampleAccessionBySubmissionId(submissionId);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //GSA
        int gsaCount = this.gsaMapper.getCraCountBySubmissionIdNoDelete(submissionId);
        System.out.println("gsaCount:"+gsaCount);
        if(gsaCount!=0){
            return 1;
        }
        //GSA-Human
        int studyCount = this.gsaMapper.getHumanCountBySubmissionIdNoDelete(submissionId);
        System.out.println("studyCount:"+studyCount);
        if(studyCount!=0){
            return 1;
        }

        //gwh
        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/api/submission/getGwhDeletableByBioSampleAccession/"+accession;
        String resultGwh = "";
        resultGwh  = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
        if(resultGwh!=""&&resultGwh!=null&&!resultGwh.equals("")){
            int gwhCount = Integer.parseInt(resultGwh);
            System.out.println("gwhCount:"+gwhCount);
            if(gwhCount!=0){
                return 1;
            }
        }else {
            SendEmail.send("gsa@big.ac.cn", "Sample删除校验——GWH接口异常"+dateFormat.format(new Date()), "Sample删除校验——GWH接口异常请联系陈旭或马英克");
        }

        //gvm
        List<String> accessionList = this.sampleMapper.getSampleAccessionListBySubmissionId(submissionId);
        String gvmUrl;
        String resultGvm = "";
        for(String acc:accessionList){
            gvmUrl = "https://ngdc.cncb.ac.cn/gvm/ajax/ajaxGetBioSampleState?param="+acc;
            JSONObject jsonObject = new JSONObject();
            resultGvm  = HttpRequestUtil.doHttpGetResponseJson(gvmUrl, null);
            if(resultGvm!=""&&resultGvm!=null&&!resultGvm.equals("")){
                jsonObject = JSONObject.parseObject(resultGvm);
                int gvmCount = (int) jsonObject.get("submitStatus");
                System.out.println("gvmCount:"+gvmCount);
                if(gvmCount!=0){
                    return 1;
                }
            } else {
                SendEmail.send("gsa@big.ac.cn", "Sample删除校验——GVM接口异常"+dateFormat.format(new Date()), "Sample删除校验——GVM接口异常请联系陈旭或唐碧霞");
                break;
            }
        }
        return res;
    }

    /**
     * 通过sampleId获取是否关联其他系统，返回是否可以删除
     * 0可以删除，1不可以删除
     */
    @RequestMapping(value = "/gsaSampleDeleteValidate/{sampleId}")
    public int gsaSampleDeleteValidate(HttpServletResponse httpServletResponse,@PathVariable("sampleId") int sampleId) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        int res = 0;
        String accession  = this.sampleMapper.getSampleAccessionBySampleId(sampleId);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //GSA
        int gsaCount = this.gsaMapper.getCraCountBySampleIdNoDelete(sampleId);
        System.out.println("gsaCount:"+gsaCount);
        if(gsaCount!=0){
            return 1;
        }
        //GSA-Human
        int studyCount = this.gsaMapper.getHumanCountBySampleIdNoDelete(sampleId);
        System.out.println("studyCount:"+studyCount);
        if(studyCount!=0){
            return 1;
        }

        //gwh
        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/api/submission/getGwhDeletableByBioSampleAccession/"+accession;
        String resultGwh = "";
        resultGwh  = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
        if(resultGwh!=""&&resultGwh!=null&&!resultGwh.equals("")){
            int gwhCount = Integer.parseInt(resultGwh);
            System.out.println("gwhCount:"+gwhCount);
            if(gwhCount!=0){
                return 1;
            }
        }else {
            SendEmail.send("gsa@big.ac.cn", "Sample删除校验——GVM接口异常"+dateFormat.format(new Date()), "Sample删除校验——GVM接口异常请联系陈旭或唐碧霞");
        }

        //gvm
        String resultGvm = "";
        String gvmUrl = "https://ngdc.cncb.ac.cn/gvm/ajax/ajaxGetBioSampleState?param="+accession;
        JSONObject jsonObject = new JSONObject();
        resultGvm  = HttpRequestUtil.doHttpGetResponseJson(gvmUrl, null);
        jsonObject = JSONObject.parseObject(resultGvm);
        int gvmCount = (int) jsonObject.get("submitStatus");
        if(gvmCount!=0){
            System.out.println("gvmCount:"+gvmCount);
            return 1;
        }

        return res;
    }

}
