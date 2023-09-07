package cn.ac.big.bigd.webservice.controller.validate;

import cn.ac.big.bigd.webservice.mapper.data.DataMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.ProjectMapper;
import cn.ac.big.bigd.webservice.mapper.human.StudyMapper;
import cn.ac.big.bigd.webservice.model.gsa.DataList;
import cn.ac.big.bigd.webservice.model.gsa.FairDetail;
import cn.ac.big.bigd.webservice.model.gsa.Fund;
import cn.ac.big.bigd.webservice.utility.HttpRequestUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * author chenxu
 */
@RestController
public class GSAProjectController {

    @Autowired
    private ProjectMapper projectMapper;


    @RequestMapping(value = "/gsaProjectDeleteValidate/{prjId}")
    public int gsaProjectDeleteValidate(HttpServletResponse httpServletResponse,@PathVariable("prjId") int prjId) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        int res = 0;
        String accession = this.projectMapper.findProjectById(prjId).getAccession();
        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/api/submission/getGwhByBioProjectAccession/"+accession;
        String resultGwh = "";
        resultGwh  = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
        JSONArray array = JSON.parseArray(resultGwh);
        System.out.println(1);

//        String fundString = this.dataMapper.getFund();
//        String fundPam = this.dataMapper.getFundPam();
////        List<String> fundList = this.dataMapper.getFundList();
//        String prjId = this.gsaMapper.getPrjId(fundString);
//        List<Integer> prjIdList = this.gsaMapper.getPrjIdList(fundString);
//        List<DataList> fairLists = new ArrayList<>();
//        //gsa
//        List<DataList> gsaList = this.gsaMapper.getGsaAccession(prjIdList);
//        fairLists.addAll(gsaList);
//        //gsa-human
//        List<DataList> humanList = this.studyMapper.getHumanAccession(prjIdList);
//        fairLists.addAll(humanList);
//        //omix
//        String omixUrl = "https://ngdc.cncb.ac.cn/omix/getOmixAccession/"+prjId;
//        String resultOmix = "";
//        resultOmix  = HttpRequestUtil.doHttpGetResponseJson(omixUrl, null);
//        JSONArray array = JSON.parseArray(resultOmix);
//        List<DataList> omixList = JSONObject.parseArray(array.toJSONString(),DataList.class);
//        fairLists.addAll(omixList);
//        //biocode
//        String biocodeUrl = "http://192.168.164.16:12321/biocode/getFairAccession/"+fundPam;
//        String resultBio = "";
//        resultBio  = HttpRequestUtil.doHttpGetResponseJson(biocodeUrl, null);
//        List<DataList> bioList = JSONObject.parseArray(resultBio,DataList.class);
//        fairLists.addAll(bioList);
//        //GWH
//        String prjAcc = this.gsaMapper.getPrjAcc(fundString);
//        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/getGwhAccession/"+prjAcc;
//        String resultGwh = "";
//        resultGwh = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
//        List<DataList> gwhList = JSONObject.parseArray(resultGwh,DataList.class);
//        fairLists.addAll(gwhList);
//        //DataBaseCommons
//        String dbUrl = "https://ngdc.cncb.ac.cn/databasecommons/api/biodb/list/"+fundPam;
//        String resultDb = "";
//        resultDb  = HttpRequestUtil.doHttpGetResponseJson(dbUrl, null);
//        List<DataList> dbList = JSONObject.parseArray(resultDb,DataList.class);
//        fairLists.addAll(dbList);
//        //GVM
//        int len = 30;
//        String[] prjAccSp = prjAcc.split(",");
//        String[][] result = new String[(prjAccSp.length + len - 1) / len][];
//        int index = 0;
//        for (int i = 0; i < prjAccSp.length; i += len) {
//            result[index++] = Arrays.copyOfRange(prjAccSp, i, Math.min(i + len, prjAccSp.length));
//        }
//        String gvmUrl = "";
//        for(String[] rs:result){
//            String pjAcc = "";
//            for(String acc:rs){
//                if(pjAcc!=""){
//                    pjAcc = pjAcc+","+acc;
//                } else {
//                    pjAcc = acc;
//                }
//            }
//            gvmUrl = gvmUrl = "https://ngdc.cncb.ac.cn/gvm/getGVMDataSetList/"+pjAcc;
//            String resultGvm = "";
//            resultGvm  = HttpRequestUtil.doHttpGetResponseJson(gvmUrl, null);
//            List<DataList> gvmList = JSONObject.parseArray(resultGvm,DataList.class);
//            fairLists.addAll(gvmList);
//        }

        return res;
    }

}
