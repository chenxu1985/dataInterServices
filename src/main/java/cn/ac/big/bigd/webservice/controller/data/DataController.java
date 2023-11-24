package cn.ac.big.bigd.webservice.controller.data;

import cn.ac.big.bigd.webservice.mapper.data.DataMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.mapper.human.StudyMapper;
import cn.ac.big.bigd.webservice.model.gsa.FairDetail;
import cn.ac.big.bigd.webservice.model.gsa.DataList;
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
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * author chenxu
 */
@RestController
public class DataController {

    @Autowired
    private GsaMapper gsaMapper;
    @Autowired
    private DataMapper dataMapper;
    @Autowired
    private StudyMapper studyMapper;

    @RequestMapping(value = "/getAccessionList")
    public List<DataList> getAccessionList(HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        String fundString = this.dataMapper.getFund();
        String fundPam = this.dataMapper.getFundPam();
//        List<String> fundList = this.dataMapper.getFundList();
        String prjId = this.gsaMapper.getPrjId(fundString);
        List<Integer> prjIdList = this.gsaMapper.getPrjIdList(fundString);
        List<DataList> fairLists = new ArrayList<>();
        //gsa
        List<DataList> gsaList = this.gsaMapper.getGsaAccession(prjIdList);
        fairLists.addAll(gsaList);
        //gsa-human
        List<DataList> humanList = this.studyMapper.getHumanAccession(prjIdList);
        fairLists.addAll(humanList);
        //omix
        String omixUrl = "https://ngdc.cncb.ac.cn/omix/getOmixAccession/"+prjId;
        String resultOmix = "";
        resultOmix  = HttpRequestUtil.doHttpGetResponseJson(omixUrl, null);
        JSONArray array = JSON.parseArray(resultOmix);
        List<DataList> omixList = JSONObject.parseArray(array.toJSONString(),DataList.class);
        fairLists.addAll(omixList);
        //biocode
        String biocodeUrl = "http://192.168.164.16:12321/biocode/getFairAccession/"+fundPam;
        String resultBio = "";
        resultBio  = HttpRequestUtil.doHttpGetResponseJson(biocodeUrl, null);
        List<DataList> bioList = JSONObject.parseArray(resultBio,DataList.class);
        fairLists.addAll(bioList);
        //GWH
        String prjAcc = this.gsaMapper.getPrjAcc(fundString);
        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/getGwhAccession/"+prjAcc;
        String resultGwh = "";
        resultGwh = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
        JSONArray arrayGwh = JSON.parseArray(resultGwh);
        List<DataList> gwhList = JSONObject.parseArray(arrayGwh.toJSONString(),DataList.class);
        fairLists.addAll(gwhList);
        //DataBaseCommons
        String dbUrl = "https://ngdc.cncb.ac.cn/databasecommons/api/biodb/list/"+fundPam;
        String resultDb = "";
        resultDb  = HttpRequestUtil.doHttpGetResponseJson(dbUrl, null);
        List<DataList> dbList = JSONObject.parseArray(resultDb,DataList.class);
        fairLists.addAll(dbList);
        //GVM
        int len = 30;
        String[] prjAccSp = prjAcc.split(",");
        String[][] result = new String[(prjAccSp.length + len - 1) / len][];
        int index = 0;
        for (int i = 0; i < prjAccSp.length; i += len) {
            result[index++] = Arrays.copyOfRange(prjAccSp, i, Math.min(i + len, prjAccSp.length));
        }
        String gvmUrl = "";
        for(String[] rs:result){
            String pjAcc = "";
            for(String acc:rs){
                if(pjAcc!=""){
                    pjAcc = pjAcc+","+acc;
                } else {
                    pjAcc = acc;
                }
            }
            gvmUrl = gvmUrl = "https://ngdc.cncb.ac.cn/gvm/getGVMDataSetList/"+pjAcc;
            String resultGvm = "";
            resultGvm  = HttpRequestUtil.doHttpGetResponseJson(gvmUrl, null);
            List<DataList> gvmList = JSONObject.parseArray(resultGvm,DataList.class);
            fairLists.addAll(gvmList);
        }


//        //        String genbaseUrl = "https://ngdc.cncb.ac.cn/gvm/getGVMDataSetList/"+prjAcc;
//        String genbaseUrl = "http://192.168.164.95:9500/genbase/api/acclist/XDB380503";
//        String resultGenBase = "";
//        resultGenBase  = HttpRequestUtil.doHttpGetResponseJson(genbaseUrl, null);
//        List<DataList> genbaseList = JSONObject.parseArray(resultGenBase,DataList.class);
//        fairLists.addAll(genbaseList);
        return fairLists;
    }

    @RequestMapping(value = "/getAccessionDetail/{accession}")
    public FairDetail getAccessionDetail(@PathVariable("accession") String accession,HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        FairDetail fairDetail = new FairDetail();
        String urlLink = "";
        String result = "";
        SimpleDateFormat simpleDateFormat = null;
        String prjString = "";
        String numberString = "";
        List<Fund> funds = null;
        if(accession.contains("CRA")||accession.contains("HRA")){
            if(accession.contains("CRA")){
                fairDetail = this.gsaMapper.getFairDetailGsa(accession);
                funds = this.gsaMapper.getFundGsa(Integer.parseInt(fairDetail.getPrjId()));
                fairDetail.setFund(funds);
            } else if(accession.contains("HRA")) {
                fairDetail = this.studyMapper.getFairDetailHuman(accession);
                funds = this.gsaMapper.getFundGsa(Integer.parseInt(fairDetail.getPrjId()));
                fairDetail.setFund(funds);
            }
        } else {
            if(accession.contains("OMIX")){
                urlLink= "https://ngdc.cncb.ac.cn/omix/getDetailOmix/"+accession;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            } else if(accession.contains("BT")){
                urlLink = "http://192.168.164.16:12321/biocode/getFairDetailBiocode/"+accession;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            } else if(accession.contains("GWH")){
                urlLink = "https://ngdc.cncb.ac.cn/gwh/getDetailGwh/"+accession;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            } else if(accession.contains("DB")){
                urlLink = "https://ngdc.cncb.ac.cn/databasecommons/api/biodb/detail/"+accession;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            else if(accession.contains("GVM")||accession.contains("GVP")){
                urlLink = "https://ngdc.cncb.ac.cn/gvm/getGVMDataDetail/"+accession;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
//            else {
//                urlLink = "http://192.168.164.95:9500/genbase/api/accdetail/"+accession;
//                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            }
            JSONObject jsonObject = new JSONObject();

            if(accession.contains("OMIX")||accession.contains("BT")||accession.contains("DB")){
                result  = HttpRequestUtil.doHttpGetResponseJson(urlLink, null);
                jsonObject = JSONObject.parseObject(result);
            } else {
                result  = HttpRequestUtil.doHttpGetResponseJson(urlLink, null);
                JSONArray jsonA = JSONArray.parseArray(result);
                jsonObject = (JSONObject) jsonA.get(0);
            }
            String  omixAcc = (String) jsonObject.get("accession");
            String  type = (String) jsonObject.get("type");
            String  title = (String) jsonObject.get("title");
            String  version = (String) jsonObject.get("version");
            String  description = (String) jsonObject.get("description");
            String  keyword = (String) jsonObject.get("keyword");
            String  subject = (String) jsonObject.get("subject");
            String  datePublished = (String) jsonObject.get("datePublished");
            Date publishDate = simpleDateFormat.parse(datePublished);
            String  dateModified = (String) jsonObject.get("dateModified");
            if(dateModified!=null){
                Date modifyDate = simpleDateFormat.parse(dateModified);
                fairDetail.setDateModified(modifyDate);
            }
            String  creativeWorkStatus = "";
            if(accession.contains("OMIX")||accession.contains("BT")||accession.contains("DB")||accession.contains("GWH")){
                creativeWorkStatus = (String) jsonObject.get("creativeWorkStatus");
            } else {
                creativeWorkStatus =  jsonObject.get("creativeWorkStatus") +"";
            }
            String  fileSize = "";
            if(accession.contains("OMIX")){
                int  prjId = (int) jsonObject.get("prjId");
                prjString = prjId+"";
                numberString = (String) jsonObject.get("fileNumber");
                funds = this.gsaMapper.getFundGsa(Integer.parseInt(prjString));
                fairDetail.setFund(funds);
//                Long size = (Long) jsonObject.get("fileSize");
//                fileSize = size+"";
                fileSize = (String) jsonObject.get("fileSize");
            } else if(accession.contains("BT")||accession.contains("DB")){
                prjString = (String) jsonObject.get("prjId");
                numberString = (String) jsonObject.get("fileNumber");
                numberString = "0";
                if(creativeWorkStatus.contains("已发布")){
                    creativeWorkStatus = "3";
                }
                funds = JSON.parseArray(jsonObject.getJSONArray("fund").toString(), Fund.class);
                fairDetail.setFund(funds);
                fileSize = (String) jsonObject.get("fileSize");
                fileSize = "0";
            } else if(accession.contains("GWH")){
                prjString = (String) jsonObject.get("prjAccession");
                numberString = (String) jsonObject.get("fileNumber");
                numberString = "1";
                if(creativeWorkStatus.equals("已发布")){
                    creativeWorkStatus = "3";
                }
                funds = this.gsaMapper.getFundProAcc(prjString);
                fairDetail.setFund(funds);
                fileSize = (String) jsonObject.get("fileSize");
            }else if(accession.contains("GVM")||accession.contains("GVP")){
                prjString = (String) jsonObject.get("prjAccession");
                numberString = jsonObject.get("fileNumber")+"";
                //numberString = "1";
                if(creativeWorkStatus.equals("已发布")){
                    creativeWorkStatus = "3";
                }
                funds = this.gsaMapper.getFundProAcc(prjString);
                fairDetail.setFund(funds);
                fileSize = (String) jsonObject.get("fileSize");
                if(fileSize==null){
                    fileSize = "0";
                } else {
                    if(fileSize.contains(".0")){
                        fileSize = fileSize.replace(".0","");
                    }
                    fileSize = Integer.parseInt(fileSize)*1024+"";
                }
            }else {
                prjString = (String) jsonObject.get("prjAccession");
                numberString = jsonObject.get("fileNumber")+"";
                numberString = "1";
                if(creativeWorkStatus.equals("已发布")){
                    creativeWorkStatus = "3";
                }
                funds = this.gsaMapper.getFundProAcc(prjString);
                fairDetail.setFund(funds);
                fileSize = (String) jsonObject.get("fileSize");
            }
            String  prjAccession = (String) jsonObject.get("prjAccession");
            String  userName = (String) jsonObject.get("userName");
            String  email = (String) jsonObject.get("email");
            String  org = (String) jsonObject.get("org");
            String  accessRestrictions = (String) jsonObject.get("accessRestrictions");
            String  encodingFormat = (String) jsonObject.get("encodingFormat");
            String  url = (String) jsonObject.get("url");
            String  dateAvailable = "";
            String  isControl = "";
            Date availableDate ;
            dateAvailable = (String) jsonObject.get("dateAvailable");

            if(accession.contains("GVM")||accession.contains("GVP")||accession.contains("BT")||accession.contains("DB")){
                availableDate = publishDate;
                isControl = "0";
            } else  if(accession.contains("GWH")){
                availableDate = simpleDateFormat.parse(dateAvailable);
                 Integer inCon = (Integer) jsonObject.get("isControl");
                isControl = inCon +"";
            } else {
                availableDate = simpleDateFormat.parse(dateAvailable);
                isControl = (String) jsonObject.get("isControl");
            }

            fairDetail.setAccession(omixAcc);
            fairDetail.setType(type);
            fairDetail.setTitle(title);
            fairDetail.setVersion(version);
            fairDetail.setDescription(description);
            fairDetail.setKeyword(keyword);
            fairDetail.setSubject(subject);
            fairDetail.setDatePublished(publishDate);
            fairDetail.setDateAvailable(availableDate);
            fairDetail.setIsControl(isControl);
            fairDetail.setCreativeWorkStatus(creativeWorkStatus);
            fairDetail.setPrjId(prjString);
            fairDetail.setPrjAccession(prjAccession);
            fairDetail.setUserName(userName);
            fairDetail.setEmail(email);
            fairDetail.setOrg(org);
            fairDetail.setUrl(url);
            fairDetail.setAccessRestrictions(accessRestrictions);
            fairDetail.setFileNumber(numberString);
            fairDetail.setFileSize(fileSize);
            fairDetail.setEncodingFormat(encodingFormat);

        }
        if(!accession.contains("BT")&&!accession.contains("DB")){
            List<Fund> fundG = fairDetail.getFund();
            for(Fund fo:fundG){
                String  grantId = fo.getGrantId();
                List<cn.ac.big.bigd.webservice.model.data.Fund> fundList = this.dataMapper.getFundDetaiList();
                for(cn.ac.big.bigd.webservice.model.data.Fund fu:fundList){
                    String dmp = fu.getGrantDmp();
                    String grant = fu.getGrantId();
                    if(grantId.contains(grant)){
                        fo.setGrantId(dmp);
                    }
                }
            }
        } else {
            List<Fund> fundG = fairDetail.getFund();
            for(Fund fo:fundG){
                int count = 0;
                String  grantId = fo.getGrantId();
                List<cn.ac.big.bigd.webservice.model.data.Fund> fundList = this.dataMapper.getFundDetaiList();
                for(cn.ac.big.bigd.webservice.model.data.Fund fu:fundList){
                    String dmp = fu.getGrantDmp();
                    String grant = fu.getGrantId();
                    if(grantId.contains(grant)){
                        if(count==0){
                            fo.setGrantId(dmp);
                            count++;
                        } else {
                            Fund foNew = new Fund();
                            foNew.setGrantId(dmp);
                            fundG.add(foNew);
                            count++;
                        }

                    }
                }
                break;
            }
        }


        return fairDetail;
    }
    /**
     * 将json数据转换成pojo对象list/map
     */
    public static List jsonToList(String jsonData, Class beanType) {
        ObjectMapper MAPPER = new ObjectMapper();
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        //如果是Map类型  MAPPER.getTypeFactory().constructParametricType(HashMap.class,String.class, beanType);
        try {
            //是否强制让非数组模式的json字符串与java集合类型相匹配，默认是false，这里改为true
            MAPPER.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            List list = MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
