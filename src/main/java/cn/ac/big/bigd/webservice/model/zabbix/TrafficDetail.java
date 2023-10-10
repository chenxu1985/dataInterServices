package cn.ac.big.bigd.webservice.model.zabbix;

import java.util.List;

public class TrafficDetail {
    private List<Traffic> upload;
    private List<Traffic> downLoad;

    public List<Traffic> getUpload() {
        return upload;
    }

    public void setUpload(List<Traffic> upload) {
        this.upload = upload;
    }

    public List<Traffic> getDownLoad() {
        return downLoad;
    }

    public void setDownLoad(List<Traffic> downLoad) {
        this.downLoad = downLoad;
    }
}
