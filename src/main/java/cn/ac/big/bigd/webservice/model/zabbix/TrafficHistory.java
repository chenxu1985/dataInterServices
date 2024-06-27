package cn.ac.big.bigd.webservice.model.zabbix;

import java.util.Date;
import java.util.List;

public class TrafficHistory {
    private List<TrafficHistoryDetail> uploadTraffic;
    private List<TrafficHistoryDetail> downLoadTraffic;

    public List<TrafficHistoryDetail> getUploadTraffic() {
        return uploadTraffic;
    }

    public void setUploadTraffic(List<TrafficHistoryDetail> uploadTraffic) {
        this.uploadTraffic = uploadTraffic;
    }

    public List<TrafficHistoryDetail> getDownLoadTraffic() {
        return downLoadTraffic;
    }

    public void setDownLoadTraffic(List<TrafficHistoryDetail> downLoadTraffic) {
        this.downLoadTraffic = downLoadTraffic;
    }
}
