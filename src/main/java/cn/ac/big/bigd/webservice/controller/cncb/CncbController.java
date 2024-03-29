package cn.ac.big.bigd.webservice.controller.cncb;

import cn.ac.big.bigd.webservice.mapper.ftp.FtpInfoMapper;
import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.mapper.human.StudyMapper;
import cn.ac.big.bigd.webservice.mapper.ncbi.NcbiMapper;
import cn.ac.big.bigd.webservice.model.cncb.DownLoad;
import cn.ac.big.bigd.webservice.model.cncb.IndexLine;
import cn.ac.big.bigd.webservice.model.cncb.ServicesData;
import cn.ac.big.bigd.webservice.model.cncb.Share;
import cn.ac.big.bigd.webservice.model.gsa.Cra;
import cn.ac.big.bigd.webservice.model.gsa.CraDownLoad;
import cn.ac.big.bigd.webservice.model.gsa.DataList;
import cn.ac.big.bigd.webservice.model.gsa.DateFileSize;
import cn.ac.big.bigd.webservice.utility.HttpRequestUtil;
import cn.ac.big.bigd.webservice.utility.SSHUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * author chenxu
 */
@RestController
public class CncbController {

    @Autowired
    private GsaMapper gsaMapper;

    @Autowired
    private StudyMapper studyMapper;

    @Autowired
    private NcbiMapper ncbiMapper;

    @Autowired
    private FtpInfoMapper ftpInfoMapper;

    @RequestMapping(value = "/getServicesData")
    public ServicesData getData(HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        ServicesData servicesData = new ServicesData();
        //数据量
        Double gsaAchivedFastqData = this.gsaMapper.getFastqAchivedData();
        Double gsaAchivedOtherData = this.gsaMapper.getOtherAchivedData();
        Double gsaPubFastqData = this.gsaMapper.getFastqPubData();
        Double gsaPubOtherData = this.gsaMapper.getOtherPubData();

        Double humanAchivedFastqData = this.studyMapper.getFastqAchivedData();
        Double humanAchivedOtherData = this.studyMapper.getOtherAchivedData();
        Double humanPubFastqData = this.studyMapper.getFastqPubData();
        Double humanPubOtherData = this.studyMapper.getOtherPubData();

        Double allAchivedData = gsaAchivedFastqData + gsaAchivedOtherData + humanAchivedFastqData + humanAchivedOtherData;
        Double allPubData = gsaPubFastqData + gsaPubOtherData + humanPubFastqData + humanPubOtherData;
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.0");
        servicesData.setAchivedData(df.format(allAchivedData));
        servicesData.setPubData(df.format(allPubData));
        //服务用户与单位
        List<String> gsaUserList = this.gsaMapper.getUserList();
        List<String> humanUserList = this.studyMapper.getUserList();
        gsaUserList.addAll(humanUserList);
        Set set = new HashSet();
        set.addAll(gsaUserList);
        List<String> allList =  new ArrayList();
        allList.addAll(set);
        int userCount = allList.size();
        List<String> gsaOrfList = this.gsaMapper.getUserOrgList();
        List<String> humanOrgList = this.studyMapper.getUserOrgList();
        gsaOrfList.addAll(humanOrgList);
        Set setOrg = new HashSet();
        setOrg.addAll(gsaOrfList);
        List<String> allOrgList =  new ArrayList();
        allOrgList.addAll(setOrg);
        int orgCount = allOrgList.size();
        servicesData.setSevUser(userCount);
        servicesData.setSevOrg(orgCount);
        //资助项目
        int prjCnt = this.gsaMapper.getGrants();
        int orgTypeCnt = this.gsaMapper.getAgencys();
        servicesData.setPrjCnt(prjCnt);
        servicesData.setOrgTypeCnt(orgTypeCnt);
        //文章期刊
        int citeCnt = this.gsaMapper.getArticleCounts();
        int journalCnt = this.gsaMapper.getJournalCounts();
        servicesData.setCiteCnt(citeCnt);
        servicesData.setJournalCnt(journalCnt);
        //访问量
        String visUrl = "https://ngdc.cncb.ac.cn/analytics/api/distribution/total?start=20160101&end=";
        String resultVis = "";
        resultVis  = HttpRequestUtil.doHttpGetResponseJson(visUrl, null);
        JSONObject jsonObject = new JSONObject();
        jsonObject = JSONObject.parseObject(resultVis);
        int visPersonCnt = (int)jsonObject.get("uvTotal");
        int visCnt = (int)jsonObject.get("pvTotal");
        servicesData.setVisPersonCnt(visPersonCnt);
        servicesData.setVisCnt(visCnt);
        //共享下载
        List<DownLoad> downLoadList = getDownLoadCountsList();
        servicesData.setDownLoadList(downLoadList);
        //共享分享
        List<Share> shareList = this.studyMapper.getShareList();
        int i = 1;
        for(Share d:shareList){
            d.setIndex(i);
            i++;
        }
        servicesData.setShareList(shareList);
        //GSA数据增长图
        IndexLine lineGsa = getLineGsa();
        servicesData.setLineGsa(lineGsa);
        //Insdc数据增长图
        IndexLine lineInsdc = getLineInsdc();
        servicesData.setLineInsdc(lineInsdc);
        SSHUtils ssh = new SSHUtils("192.168.164.20", "gsagroup", "gsa@big35$2019!",22);
        String cmd = "curl http://192.168.164.109/report/total/total.html  -s |grep -o -P 'unique_visitors.{0,27}'|grep -Eo '[0-9]{1,}'  > /webdb/gsagroup/webApplications/dataInterServices/unique";
        ssh.execCommandByJSch(cmd);
        String cmd2 = "curl http://192.168.164.109/report/total/total.html  -s |grep -o -P 'total_requests.{0,31}'|grep -Eo '[0-9]{1,}'  > /webdb/gsagroup/webApplications/dataInterServices/total";
        ssh.execCommandByJSch(cmd2);
        ssh.closeSession();

        File uniqueFile = new File("/webdb/gsagroup/webApplications/dataInterServices/unique");
        InputStreamReader uniqueRead = null;//考虑到编码格式
        File totalFile = new File("/webdb/gsagroup/webApplications/dataInterServices/total");
        InputStreamReader totalRead = null;//考虑到编码格式
        String unique = "";
        String total = "";

        try {
            uniqueRead = new InputStreamReader(new FileInputStream(uniqueFile),"GBK");
            BufferedReader uniqueBuffered = new BufferedReader(uniqueRead);
            String uniqueTxt = null;

            while((uniqueTxt = uniqueBuffered.readLine()) != null){
                //解析文件具体路径
                String str =  uniqueTxt;
                unique = str;
            }
            uniqueRead.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            totalRead = new InputStreamReader(new FileInputStream(totalFile),"GBK");
            BufferedReader totalBuffered = new BufferedReader(totalRead);
            String totalTxt = null;

            while((totalTxt = totalBuffered.readLine()) != null){
                //解析文件具体路径
                String str =  totalTxt;
                total = str;
            }
            totalRead.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        servicesData.setUniqueVisitors(unique);
        servicesData.setTotalRequests(total);
        return servicesData;
    }
    public List<DownLoad> getDownLoadCountsList(){
        List<DownLoad> downloads = new ArrayList<DownLoad>();

        List<DownLoad> downloadsCra = this.ftpInfoMapper.getDownLoadCountCra();
        List<DownLoad> downloadsPrj = this.ftpInfoMapper.getDownLoadCountPrj();
        downloads.addAll(downloadsCra);
        downloads.addAll(downloadsPrj);

        List<DownLoad> gsaDownloads = new ArrayList<DownLoad>();
        List<DownLoad> projectDownloads = new ArrayList<DownLoad>();
        for(DownLoad summary: downloads){
            if(summary.getAccession().contains("CRA")){//CRA accession, get run_file_size and release_date
                CraDownLoad cra = this.gsaMapper.selectCraByAccession(summary.getAccession());
                if(cra.getStatus()==5){
                    continue;
                }
                summary.setCraUrl("https://ngdc.cncb.ac.cn/gsa/browse/"+cra.getAccession());
                String desc = "";
                if(cra.getDesc()!=null){
                    desc = cra.getDesc();
                } else {
                    desc = cra.getTitle();
                }
                summary.setDataDes(desc);
                gsaDownloads.add(summary);
            }else{//Project accession
                CraDownLoad cra = this.gsaMapper.selectCraByProAccession(summary.getAccession());
                summary.setAccession(cra.getAccession());
                summary.setCraUrl("https://ngdc.cncb.ac.cn/gsa/browse/"+cra.getAccession());
                String desc = "";
                if(cra.getDesc()!=null){
                    desc = cra.getDesc();
                } else {
                    desc = cra.getTitle();
                }
                summary.setDataDes(desc);
                projectDownloads.add(summary);
            }
        }
        List<DownLoad> top20Downloads = getTop10Downloads(gsaDownloads,projectDownloads);
        return top20Downloads;
    }
    public List<DownLoad> getDownLoadList(){
        List<DownLoad> downloads = new ArrayList<DownLoad>();

        String uri = "http://192.168.164.16:9089/ftplog/getTopDownloads";

        RestTemplate template = new RestTemplate();
        String downloadStr = template.getForObject(uri, String.class);
        net.sf.json.JSONArray jsonArray = JSONArray.fromObject(downloadStr);
        Iterator<Object> it = jsonArray.iterator();
        while(it.hasNext()){
            net.sf.json.JSONObject obj = (net.sf.json.JSONObject)it.next();
            DownLoad ftpDataDownloadSummary = (DownLoad) net.sf.json.JSONObject.toBean(obj, DownLoad.class);
            downloads.add(ftpDataDownloadSummary);
        }
        List<DownLoad> gsaDownloads = new ArrayList<DownLoad>();
        List<DownLoad> projectDownloads = new ArrayList<DownLoad>();
        for(DownLoad summary: downloads){
            if(summary.getAccession().contains("CRA")){//CRA accession, get run_file_size and release_date
                CraDownLoad cra = this.gsaMapper.selectCraByAccession(summary.getAccession());
                if(cra.getStatus()==5){
                    continue;
                }
                summary.setCraUrl("https://ngdc.cncb.ac.cn/gsa/browse/"+cra.getAccession());
                summary.setDataDes(cra.getTitle());
                gsaDownloads.add(summary);
            }else{//Project accession
                CraDownLoad cra = this.gsaMapper.selectCraByProAccession(summary.getAccession());
                summary.setAccession(cra.getAccession());
                summary.setCraUrl("https://ngdc.cncb.ac.cn/gsa/browse/"+cra.getAccession());
                summary.setDataDes(cra.getTitle());
                projectDownloads.add(summary);
            }
        }
        List<DownLoad> top20Downloads = getTop10Downloads(gsaDownloads,projectDownloads);
        return top20Downloads;
    }
    public List<DownLoad> getTop10Downloads(List<DownLoad> gsaDownloads,List<DownLoad> projectDownloads) {
        List<DownLoad> top20Downloads = null;
        if (projectDownloads == null || projectDownloads.size() == 0) { //no project downloads
            if (gsaDownloads != null && gsaDownloads.size() > 0) {
                top20Downloads = gsaDownloads.subList(0, 10);
            }
        } else { //both project downloads and gsa downloads, first merge, then sort
            for (DownLoad projectDownload : projectDownloads) { //mearg
                for (int i=0;i<gsaDownloads.size();i++) {
                    if (projectDownload.getAccession().equals(gsaDownloads.get(i).getAccession())) {
                        DownLoad duplicate = gsaDownloads.get(i);
                        duplicate.setDownloadSize(duplicate.getDownloadSize() + projectDownload.getDownloadSize());
                        for(int j=0;j<i;j++){ //sort gsa downloads
                            if(gsaDownloads.get(j).getDownloadSize()<duplicate.getDownloadSize()){
                                DownLoad summary1 = duplicate;
                                for(int n=i;n>j;n--){
                                    gsaDownloads.set(n,gsaDownloads.get(n-1));
                                }
                                gsaDownloads.set(j,summary1);
                                break;
                            }
                        }
                        projectDownload.setDownloadSize(0l);
                        break;
                    }
                }
            }
            List<DownLoad> merge = new ArrayList<DownLoad>();
            int i = 0;
            int j = 0;
            while (i < projectDownloads.size() && j < gsaDownloads.size()) {
                if (projectDownloads.get(i).getDownloadSize()==0l) {
                    i++;
                    continue;
                }
                if (projectDownloads.get(i).getDownloadSize() > gsaDownloads.get(j).getDownloadSize()) {//p>g
                    merge.add(projectDownloads.get(i));
                    i++;
                } else {//p<=g
                    merge.add(gsaDownloads.get(j));
                    j++;
                }
            }
            if(i<projectDownloads.size() ){
                merge.addAll(projectDownloads.subList(i,projectDownloads.size()));
            }
            if(j < gsaDownloads.size()){
                merge.addAll(gsaDownloads.subList(j,gsaDownloads.size()));
            }
//            System.out.println("merge size:" + merge.size());
            top20Downloads = merge.subList(0, 10);
        }
        int i = 1;
        for(DownLoad d:top20Downloads){
            d.setIndex(i);
            i++;
        }
        return top20Downloads;
    }

    public IndexLine getLineGsa(){
        IndexLine indexLine = new IndexLine();
        Double maxPb = this.gsaMapper.selectMaxPb();
        java.text.DecimalFormat   dfInsdc   =new   java.text.DecimalFormat("#.00");
        int day=0;
        List<DateFileSize> dateFileSizeList = this.gsaMapper.selectAllDate();
        List<String> dateList = new ArrayList<>();
        List<Double> fileList = new ArrayList<>();
        for(DateFileSize dateFileSize:dateFileSizeList){
            String date = dateFileSize.getDate();
            Double fileSize = dateFileSize.getFileSize();
            if(fileSize!=0){
                day++;
            }
            dateList.add(date);
            java.text.DecimalFormat   df1   =new   java.text.DecimalFormat("#.00");
            fileSize = Double.parseDouble(df1.format(fileSize));
            fileList.add(fileSize);
        }
        indexLine.setDateList(dateList);
        indexLine.setMaxPb(dfInsdc.format(maxPb));
        indexLine.setFileList(fileList);
        return indexLine;
    }
    public IndexLine getLineInsdc(){
        IndexLine indexLine = new IndexLine();
        Double maxPb = this.ncbiMapper.selectMaxPb();
        java.text.DecimalFormat   dfInsdc   =new   java.text.DecimalFormat("#.00");
        List<String> dateList = new ArrayList<>();
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        try {
            start.setTime(f2.parse("2022-07-01"));
            Date to = new Date();
            String toStr = f2.format(to);
            end.setTime(f2.parse(toStr));

            while (start.before(end)) {
                dateList.add(String.format("%tY-%tm-01", start, start));
                start.add(Calendar.MONTH, 1);
            }
            if(!start.equals(end)){
                dateList.add(String.format("%tY-%tm-%td", end, end,end));
            } else {
                dateList.add(String.format("%tY-%tm-01", start, start));
            }
            //dateList.add(String.format("%tY-%tm-01", start, start));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Double> fileList = new ArrayList<>();
        for(String date:dateList){
            Map<String,String> params = new HashMap<>();
            params.put("start","2022-07-01");
            params.put("end",date);
            Double datePb = this.ncbiMapper.getFileSizeByDate(params);
            java.text.DecimalFormat   df1   =new   java.text.DecimalFormat("#.00");
            datePb = Double.parseDouble(df1.format(datePb));
            fileList.add(datePb);
        }
        indexLine.setMaxPb(dfInsdc.format(maxPb));
        indexLine.setDateList(dateList);
        indexLine.setFileList(fileList);
        return indexLine;
    }
}
