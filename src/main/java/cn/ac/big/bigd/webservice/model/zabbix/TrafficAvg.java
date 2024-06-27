package cn.ac.big.bigd.webservice.model.zabbix;

import java.util.List;

public class TrafficAvg {
    private List<TrafficAvgDetail> uploadTrafficAvg;
    private List<TrafficAvgDetail> downLoadTrafficAvg;

    public List<TrafficAvgDetail> getUploadTrafficAvg() {
        return uploadTrafficAvg;
    }

    public void setUploadTrafficAvg(List<TrafficAvgDetail> uploadTrafficAvg) {
        this.uploadTrafficAvg = uploadTrafficAvg;
    }

    public List<TrafficAvgDetail> getDownLoadTrafficAvg() {
        return downLoadTrafficAvg;
    }

    public void setDownLoadTrafficAvg(List<TrafficAvgDetail> downLoadTrafficAvg) {
        this.downLoadTrafficAvg = downLoadTrafficAvg;
    }
}
