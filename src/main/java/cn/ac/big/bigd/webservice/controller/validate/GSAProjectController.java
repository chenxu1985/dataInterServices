package cn.ac.big.bigd.webservice.controller.validate;

import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.ProjectMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.SampleMapper;
import cn.ac.big.bigd.webservice.mapper.human.StudyMapper;
import cn.ac.big.bigd.webservice.mapper.omix.OmixProjectMapper;
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

/**
 * author chenxu
 */
@RestController
public class GSAProjectController {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private SampleMapper sampleMapper;

    @Autowired
    private GsaMapper gsaMapper;

    @Autowired
    private StudyMapper studyMapper;

    @Autowired
    private OmixProjectMapper omixProjectMapper;

    /**
     * 通过prjId获取是否关联其他系统，返回是否可以删除
     * 0可以删除，1不可以删除
     */
    @RequestMapping(value = "/gsaProjectDeleteValidate/{prjId}")
    public int gsaProjectDeleteValidate(HttpServletResponse httpServletResponse,@PathVariable("prjId") int prjId) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        int res = 0;
        String accession = this.projectMapper.findProjectById(prjId).getAccession();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //BioSample
        int sampleCount = this.sampleMapper.getSampleCountByPrjIdNoDelete(prjId);
        System.out.println("sampleCount:"+sampleCount);
        if(sampleCount!=0){
            return 1;
        }
        //GSA
        int gsaCount = this.gsaMapper.getCraCountByPrjIdNoDelete(prjId);
        System.out.println("gsaCount:"+gsaCount);
        if(gsaCount!=0){
            return 1;
        }
        //GSA-Human
        int studyCount = this.studyMapper.getStudyCountByPrjIdNoDelete(prjId);
        System.out.println("studyCount:"+studyCount);
        if(studyCount!=0){
            return 1;
        }
        //omix
        int omixCount = this.omixProjectMapper.getOmixCountByPrjIdNoDelete(prjId);
        System.out.println("omixCount:"+omixCount);
        if(omixCount!=0){
            return 1;
        }
        //gwh
        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/api/submission/getGwhDeletableByBioProjectAccession/"+accession;
        String resultGwh = "";
        resultGwh  = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
        if(resultGwh!=""&&resultGwh!=null&&!resultGwh.equals("")){
            int gwhCount = Integer.parseInt(resultGwh);
            if(gwhCount==1){
                System.out.println("gwhCount:0");
            }
            if(gwhCount!=1){
                System.out.println("gwhCount:1");
                return 1;
            }
        } else {
            SendEmail.send("gsa@big.ac.cn", "Project删除校验——GWH接口异常"+dateFormat.format(new Date()), "Project删除校验——GWH接口异常请联系陈旭或马英克");
        }
        //gvm
        String gvmUrl = "https://ngdc.cncb.ac.cn/gvm/ajax/ajaxGetBioProjectState?param="+accession;
        String resultGvm = "";
        JSONObject jsonObject = new JSONObject();
        resultGvm  = HttpRequestUtil.doHttpGetResponseJson(gvmUrl, null);

        if(resultGvm!=""&&resultGvm!=null&&!resultGvm.equals("")){
            jsonObject = JSONObject.parseObject(resultGvm);
            int gvmCount = (int) jsonObject.get("submitStatus");
            System.out.println("gvmCount:"+gvmCount);
            if(gvmCount!=0){
                return 1;
            }
        }else {
            SendEmail.send("gsa@big.ac.cn", "Project删除校验——GVM接口异常"+dateFormat.format(new Date()), "Project删除校验——GVM接口异常请联系陈旭或唐碧霞");
        }
        return res;
    }

}
