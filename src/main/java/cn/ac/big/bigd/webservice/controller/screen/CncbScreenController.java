package cn.ac.big.bigd.webservice.controller.screen;

import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.mapper.human.StudyMapper;
import cn.ac.big.bigd.webservice.mapper.ncbi.NcbiMapper;
import cn.ac.big.bigd.webservice.mapper.zabbix.ZabbixMapper;
import cn.ac.big.bigd.webservice.model.gsa.SampleTypeFileSize;
import cn.ac.big.bigd.webservice.model.screen.*;
import cn.ac.big.bigd.webservice.model.gsa.SampleTypeCounts;
import cn.ac.big.bigd.webservice.model.zabbix.*;
import cn.ac.big.bigd.webservice.utility.HttpRequestUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * author chenxu
 */
@RestController
public class CncbScreenController {

    @Autowired
    private GsaMapper gsaMapper;

    @Autowired
    private StudyMapper studyMapper;
    @Autowired
    private NcbiMapper ncbiMapper;
    @Autowired
    private ZabbixMapper zabbixMapper;
    @RequestMapping(value = "/getScreenData")
    public ScreenServicesData getScreenData(HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        ScreenServicesData servicesData = new ScreenServicesData();
        //GSA数据量
        Double gsaAchivedFastqData = this.gsaMapper.getFastqAchivedData();
        Double gsaAchivedOtherData = this.gsaMapper.getOtherAchivedData();
        Double humanAchivedFastqData = this.studyMapper.getFastqAchivedData();
        Double humanAchivedOtherData = this.studyMapper.getOtherAchivedData();
        Double allAchivedData = gsaAchivedFastqData + gsaAchivedOtherData + humanAchivedFastqData + humanAchivedOtherData;
        java.text.DecimalFormat   dfGsa   =new   java.text.DecimalFormat("#.0");
        servicesData.setGsaData(dfGsa.format(allAchivedData));
        //Insdc数据量
        Double insdcData = this.ncbiMapper.getFileSizeAll();
        java.text.DecimalFormat   dfInsdc   =new   java.text.DecimalFormat("#.00");
        servicesData.setInsdcData(dfInsdc.format(insdcData));
        //疾病与自然人
        int patientIndividuals = this.studyMapper.getPatientIndividuals();
        int naturalIndividuals = this.studyMapper.getNaturalIndividuals();
        servicesData.setPatientIndividuals(patientIndividuals);
        servicesData.setNaturalIndividuals(naturalIndividuals);
        DataComposition dataComposition = new DataComposition();
        List<SampleTypeCounts> sampleTypeCounts = this.gsaMapper.getCraCountsBySampleType();
        int microbeDataSets = 0;
        int animalDataSets = 0;
        int humanDataSets = 0;
        int plantDataSets = 0;
        double microbeFileSize = 0;
        double animalFileSize = 0;
        double humanFileSize = 0;
        double plantFileSize = 0;
        for(SampleTypeCounts typeCounts:sampleTypeCounts){
            int typeId = typeCounts.getSampleTypeId();
            if(typeId==1){
                microbeDataSets = typeCounts.getCounts();
            } else if(typeId==2){
                animalDataSets = typeCounts.getCounts();
            } else if(typeId==3){
                humanDataSets = typeCounts.getCounts();
            } else if(typeId==4){
                plantDataSets = typeCounts.getCounts();
            }
        }
        int hraDataSets = this.studyMapper.getHraCounts();
        double hraFileSize = this.studyMapper.getHraFileSize();
        List<SampleTypeFileSize> sampleTypeFileSize1 = this.gsaMapper.getCraFileSizeBySampleType1();
        List<SampleTypeFileSize> sampleTypeFileSize2 = this.gsaMapper.getCraFileSizeBySampleType2();
        for(SampleTypeFileSize sampleTypeFileSize:sampleTypeFileSize1){
            int type = sampleTypeFileSize.getSampleTypeId();
            double size = sampleTypeFileSize.getFileSize();
            if(type==3){
                microbeFileSize = size ;
            } else if(type==4){
                animalFileSize = size ;
            } else if(type==5){
                humanFileSize = size ;
            } else if(type==6){
                plantFileSize = size ;
            }
        }

        for(SampleTypeFileSize sampleTypeFileSize:sampleTypeFileSize2){
            int type = sampleTypeFileSize.getSampleTypeId();
            double size = sampleTypeFileSize.getFileSize();
            if(type==3){
                microbeFileSize = microbeFileSize + size ;
            } else if(type==4){
                animalFileSize = animalFileSize + size ;
            } else if(type==5){
                humanFileSize = humanFileSize + size ;
            } else if(type==6){
                plantFileSize = plantFileSize + size ;
            }
        }
        humanDataSets = humanDataSets + hraDataSets;
        humanFileSize = humanFileSize + hraFileSize;
        String gwhUrl = "https://ngdc.cncb.ac.cn/gwh/api/statistics/getNewAssemblyStats";
        String resultGwh = "";
        resultGwh  = HttpRequestUtil.doHttpGetResponseJson(gwhUrl, null);
        JSONObject jsonObject = new JSONObject();
        jsonObject = JSONObject.parseObject(resultGwh);
        int microbiology_id_count = Integer.parseInt((String) jsonObject.get("microbiology_id_count"));
        double microbiology_size_sum = Double.parseDouble((String)jsonObject.get("microbiology_size_sum"));
        microbiology_size_sum = microbiology_size_sum /1048576;
        microbiology_size_sum = microbiology_size_sum /1048576;
        int animals_id_count = Integer.parseInt((String)jsonObject.get("animals_id_count"));
        double animals_size_sum = Double.parseDouble((String)jsonObject.get("animals_size_sum"));
        animals_size_sum = animals_size_sum /1048576;
        animals_size_sum = animals_size_sum /1048576;
        int human_id_count = Integer.parseInt((String)jsonObject.get("human_id_count"));
        double human_size_sum = Double.parseDouble((String)jsonObject.get("human_size_sum"));
        human_size_sum = human_size_sum /1048576;
        human_size_sum = human_size_sum /1048576;
        int plants_id_count = Integer.parseInt((String)jsonObject.get("plants_id_count"));
        double plants_size_sum = Double.parseDouble((String)jsonObject.get("plants_size_sum"));
        plants_size_sum = plants_size_sum /1048576;
        plants_size_sum = plants_size_sum /1048576;
        microbeDataSets = microbeDataSets + microbiology_id_count;
        animalDataSets = animalDataSets + animals_id_count;
        humanDataSets = humanDataSets + human_id_count;
        plantDataSets = plantDataSets + plants_id_count;
        microbeFileSize = microbeFileSize + microbiology_size_sum;
        animalFileSize = animalFileSize + animals_size_sum;
        humanFileSize = humanFileSize + human_size_sum;
        plantFileSize = plantFileSize + plants_size_sum;
        dataComposition.setMicrobeDataSets(microbeDataSets);
        dataComposition.setAnimalDataSets(animalDataSets);
        dataComposition.setHumanDataSets(humanDataSets);
        dataComposition.setPlantDataSets(plantDataSets);
        dataComposition.setMicrobeFileSize(microbeFileSize);
        dataComposition.setAnimalFileSize(animalFileSize);
        dataComposition.setHumanFileSize(humanFileSize);
        dataComposition.setPlantFileSize(plantFileSize);
        servicesData.setDataComposition(dataComposition);
        //double zabbix7 = this.zabbixMapper.getValue7();
//        servicesData.setZabbix(zabbix7);
        return servicesData;
    }

    @RequestMapping(value = "/getRealTime")
    public RealTime getRealTime(HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        RealTime realTime = new RealTime();
        Real uploadRealTime = this.zabbixMapper.getUploadRealTime();
        Real downLoadRealTime = this.zabbixMapper.getDownLoadRealTime();
        realTime.setUploadRealTime(uploadRealTime);
        realTime.setDownLoadRealTime(downLoadRealTime);
        return realTime;
    }

    @RequestMapping(value = "/getTrafficDetail")
    public TrafficDetail getTrafficDetail(HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        TrafficDetail trafficDetail = new TrafficDetail();
        List<Traffic> upload = this.zabbixMapper.getUploadRealDetail();
        List<Traffic> downLoad = this.zabbixMapper.getDownLoadRealDetail();
        trafficDetail.setUpload(upload);
        trafficDetail.setDownLoad(downLoad);
        return trafficDetail;
    }
    @RequestMapping(value = "/getTrafficList/{day}")
    public TrafficHistory getTrafficList(@PathVariable("day") int day,HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        TrafficHistory trafficHistory = new TrafficHistory();
        List<TrafficHistoryDetail> upload = this.zabbixMapper.getUploadTrafficHistoryList(day);
        List<TrafficHistoryDetail> downLoad = this.zabbixMapper.getDownLoadTrafficHistoryList(day);
        trafficHistory.setUploadTraffic(upload);
        trafficHistory.setDownLoadTraffic(downLoad);
        return trafficHistory;
    }
    @RequestMapping(value = "/getTrafficAll/{day}")
    public TrafficAll getTrafficAll(@PathVariable("day") int day,HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        TrafficAll trafficAll = new TrafficAll();
        double upload = this.zabbixMapper.getUploadTraffic(day);
        double downLoad = this.zabbixMapper.getDownLoadTraffic(day);
        trafficAll.setUploadTraffic(upload);
        trafficAll.setDownLoadTraffic(downLoad);
        return trafficAll;
    }
}
