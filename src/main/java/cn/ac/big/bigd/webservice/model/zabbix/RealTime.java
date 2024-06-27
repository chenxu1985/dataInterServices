package cn.ac.big.bigd.webservice.model.zabbix;

import cn.ac.big.bigd.webservice.model.zabbix.Real;

public class RealTime {
    private Real uploadRealTime;
    private Real downLoadRealTime;

    public Real getUploadRealTime() {
        return uploadRealTime;
    }

    public void setUploadRealTime(Real uploadRealTime) {
        this.uploadRealTime = uploadRealTime;
    }

    public Real getDownLoadRealTime() {
        return downLoadRealTime;
    }

    public void setDownLoadRealTime(Real downLoadRealTime) {
        this.downLoadRealTime = downLoadRealTime;
    }
}
