package cn.ac.big.bigd.webservice.model.cncb;

import java.util.List;

public class ServicesData {
    private String achivedData;
    private String pubData;
    private int sevUser;
    private int sevOrg;
    private int prjCnt;
    private int orgTypeCnt;
    private int citeCnt;
    private int journalCnt;
    private int visPersonCnt;
    private int visCnt;
    private List<DownLoad> downLoadList;
    private List<Share> shareList;
    private IndexLine lineGsa;
    private IndexLine lineInsdc;
    private String uniqueVisitors;
    private String totalRequests;

    public String getAchivedData() {
        return achivedData;
    }

    public void setAchivedData(String achivedData) {
        this.achivedData = achivedData;
    }

    public String getPubData() {
        return pubData;
    }

    public void setPubData(String pubData) {
        this.pubData = pubData;
    }

    public int getSevUser() {
        return sevUser;
    }

    public void setSevUser(int sevUser) {
        this.sevUser = sevUser;
    }

    public int getSevOrg() {
        return sevOrg;
    }

    public void setSevOrg(int sevOrg) {
        this.sevOrg = sevOrg;
    }

    public int getPrjCnt() {
        return prjCnt;
    }

    public void setPrjCnt(int prjCnt) {
        this.prjCnt = prjCnt;
    }

    public int getOrgTypeCnt() {
        return orgTypeCnt;
    }

    public void setOrgTypeCnt(int orgTypeCnt) {
        this.orgTypeCnt = orgTypeCnt;
    }

    public int getCiteCnt() {
        return citeCnt;
    }

    public void setCiteCnt(int citeCnt) {
        this.citeCnt = citeCnt;
    }

    public int getJournalCnt() {
        return journalCnt;
    }

    public void setJournalCnt(int journalCnt) {
        this.journalCnt = journalCnt;
    }

    public int getVisPersonCnt() {
        return visPersonCnt;
    }

    public void setVisPersonCnt(int visPersonCnt) {
        this.visPersonCnt = visPersonCnt;
    }

    public int getVisCnt() {
        return visCnt;
    }

    public void setVisCnt(int visCnt) {
        this.visCnt = visCnt;
    }

    public List<DownLoad> getDownLoadList() {
        return downLoadList;
    }

    public void setDownLoadList(List<DownLoad> downLoadList) {
        this.downLoadList = downLoadList;
    }

    public List<Share> getShareList() {
        return shareList;
    }

    public void setShareList(List<Share> shareList) {
        this.shareList = shareList;
    }

    public IndexLine getLineGsa() {
        return lineGsa;
    }

    public void setLineGsa(IndexLine lineGsa) {
        this.lineGsa = lineGsa;
    }

    public IndexLine getLineInsdc() {
        return lineInsdc;
    }

    public void setLineInsdc(IndexLine lineInsdc) {
        this.lineInsdc = lineInsdc;
    }

    public String getUniqueVisitors() {
        return uniqueVisitors;
    }

    public void setUniqueVisitors(String uniqueVisitors) {
        this.uniqueVisitors = uniqueVisitors;
    }

    public String getTotalRequests() {
        return totalRequests;
    }

    public void setTotalRequests(String totalRequests) {
        this.totalRequests = totalRequests;
    }
}
