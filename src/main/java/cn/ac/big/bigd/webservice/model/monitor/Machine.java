package cn.ac.big.bigd.webservice.model.monitor;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Machine {
    private Integer machineLogId;
    private Integer cpuNodeTotal;
    private Integer cpuNodeCoreTotal;
    private Integer cpuTf;
    private Integer gpuNodeTotal;
    private Integer gpuNodeCoreTotal;
    private Integer gpuTf;
    private String gsaPubTotal;
    private String gsaPubFree;
    private String gsaPubUse;
    private String gsaPrivTotal;
    private String gsaPrivFree;
    private String gsaPrivUse;
    private String humanPubTotal;
    private String humanPubFree;
    private String humanPubUse;
    private String humanPrivTotal;
    private String humanPrivFree;
    private String humanPrivUse;
    private String genomesTotal;
    private String genomesFree;
    private String genomesUse;
    private String offlineStoreTotal;
    private String onlineStoreTotal;
    private String onlineUser;
    private String cpuUsage;
    private String memUsage;
    private String webNode;
    private String dbNode;
    private String ftpNode;
    private String vmNode;
    private String jobTotal;
    private String jobRun;
    private String jobQueue;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date addTime;
    private List<Integer>chartList;
    private List<Integer>memList;
    private List<String>timeList;

    public Integer getMachineLogId() {
        return machineLogId;
    }

    public void setMachineLogId(Integer machineLogId) {
        this.machineLogId = machineLogId;
    }

    public Integer getCpuNodeTotal() {
        return cpuNodeTotal;
    }

    public void setCpuNodeTotal(Integer cpuNodeTotal) {
        this.cpuNodeTotal = cpuNodeTotal;
    }

    public Integer getCpuNodeCoreTotal() {
        return cpuNodeCoreTotal;
    }

    public void setCpuNodeCoreTotal(Integer cpuNodeCoreTotal) {
        this.cpuNodeCoreTotal = cpuNodeCoreTotal;
    }

    public Integer getCpuTf() {
        return cpuTf;
    }

    public void setCpuTf(Integer cpuTf) {
        this.cpuTf = cpuTf;
    }

    public Integer getGpuNodeTotal() {
        return gpuNodeTotal;
    }

    public void setGpuNodeTotal(Integer gpuNodeTotal) {
        this.gpuNodeTotal = gpuNodeTotal;
    }

    public Integer getGpuNodeCoreTotal() {
        return gpuNodeCoreTotal;
    }

    public void setGpuNodeCoreTotal(Integer gpuNodeCoreTotal) {
        this.gpuNodeCoreTotal = gpuNodeCoreTotal;
    }

    public Integer getGpuTf() {
        return gpuTf;
    }

    public void setGpuTf(Integer gpuTf) {
        this.gpuTf = gpuTf;
    }

    public String getGsaPubTotal() {
        return gsaPubTotal;
    }

    public void setGsaPubTotal(String gsaPubTotal) {
        this.gsaPubTotal = gsaPubTotal;
    }

    public String getGsaPubFree() {
        return gsaPubFree;
    }

    public void setGsaPubFree(String gsaPubFree) {
        this.gsaPubFree = gsaPubFree;
    }

    public String getGsaPubUse() {
        return gsaPubUse;
    }

    public void setGsaPubUse(String gsaPubUse) {
        this.gsaPubUse = gsaPubUse;
    }

    public String getGsaPrivTotal() {
        return gsaPrivTotal;
    }

    public void setGsaPrivTotal(String gsaPrivTotal) {
        this.gsaPrivTotal = gsaPrivTotal;
    }

    public String getGsaPrivFree() {
        return gsaPrivFree;
    }

    public void setGsaPrivFree(String gsaPrivFree) {
        this.gsaPrivFree = gsaPrivFree;
    }

    public String getGsaPrivUse() {
        return gsaPrivUse;
    }

    public void setGsaPrivUse(String gsaPrivUse) {
        this.gsaPrivUse = gsaPrivUse;
    }

    public String getHumanPubTotal() {
        return humanPubTotal;
    }

    public void setHumanPubTotal(String humanPubTotal) {
        this.humanPubTotal = humanPubTotal;
    }

    public String getHumanPubFree() {
        return humanPubFree;
    }

    public void setHumanPubFree(String humanPubFree) {
        this.humanPubFree = humanPubFree;
    }

    public String getHumanPubUse() {
        return humanPubUse;
    }

    public void setHumanPubUse(String humanPubUse) {
        this.humanPubUse = humanPubUse;
    }

    public String getHumanPrivTotal() {
        return humanPrivTotal;
    }

    public void setHumanPrivTotal(String humanPrivTotal) {
        this.humanPrivTotal = humanPrivTotal;
    }

    public String getHumanPrivFree() {
        return humanPrivFree;
    }

    public void setHumanPrivFree(String humanPrivFree) {
        this.humanPrivFree = humanPrivFree;
    }

    public String getHumanPrivUse() {
        return humanPrivUse;
    }

    public void setHumanPrivUse(String humanPrivUse) {
        this.humanPrivUse = humanPrivUse;
    }

    public String getGenomesTotal() {
        return genomesTotal;
    }

    public void setGenomesTotal(String genomesTotal) {
        this.genomesTotal = genomesTotal;
    }

    public String getGenomesFree() {
        return genomesFree;
    }

    public void setGenomesFree(String genomesFree) {
        this.genomesFree = genomesFree;
    }

    public String getGenomesUse() {
        return genomesUse;
    }

    public void setGenomesUse(String genomesUse) {
        this.genomesUse = genomesUse;
    }

    public String getOfflineStoreTotal() {
        return offlineStoreTotal;
    }

    public void setOfflineStoreTotal(String offlineStoreTotal) {
        this.offlineStoreTotal = offlineStoreTotal;
    }

    public String getOnlineStoreTotal() {
        return onlineStoreTotal;
    }

    public void setOnlineStoreTotal(String onlineStoreTotal) {
        this.onlineStoreTotal = onlineStoreTotal;
    }

    public String getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(String onlineUser) {
        this.onlineUser = onlineUser;
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(String memUsage) {
        this.memUsage = memUsage;
    }

    public String getWebNode() {
        return webNode;
    }

    public void setWebNode(String webNode) {
        this.webNode = webNode;
    }

    public String getDbNode() {
        return dbNode;
    }

    public void setDbNode(String dbNode) {
        this.dbNode = dbNode;
    }

    public String getFtpNode() {
        return ftpNode;
    }

    public void setFtpNode(String ftpNode) {
        this.ftpNode = ftpNode;
    }

    public String getVmNode() {
        return vmNode;
    }

    public void setVmNode(String vmNode) {
        this.vmNode = vmNode;
    }

    public String getJobTotal() {
        return jobTotal;
    }

    public void setJobTotal(String jobTotal) {
        this.jobTotal = jobTotal;
    }

    public String getJobRun() {
        return jobRun;
    }

    public void setJobRun(String jobRun) {
        this.jobRun = jobRun;
    }

    public String getJobQueue() {
        return jobQueue;
    }

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public List<Integer> getChartList() {
        return chartList;
    }

    public void setChartList(List<Integer> chartList) {
        this.chartList = chartList;
    }

    public List<Integer> getMemList() {
        return memList;
    }

    public void setMemList(List<Integer> memList) {
        this.memList = memList;
    }

    public List<String> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<String> timeList) {
        this.timeList = timeList;
    }
}