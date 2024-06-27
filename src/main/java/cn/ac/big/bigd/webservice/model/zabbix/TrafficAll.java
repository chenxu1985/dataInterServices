package cn.ac.big.bigd.webservice.model.zabbix;

import java.util.Date;

public class TrafficAll {
    private double uploadTraffic;
    private double downLoadTraffic;

    public double getUploadTraffic() {
        return uploadTraffic;
    }

    public void setUploadTraffic(double uploadTraffic) {
        this.uploadTraffic = uploadTraffic;
    }

    public double getDownLoadTraffic() {
        return downLoadTraffic;
    }

    public void setDownLoadTraffic(double downLoadTraffic) {
        this.downLoadTraffic = downLoadTraffic;
    }
}
