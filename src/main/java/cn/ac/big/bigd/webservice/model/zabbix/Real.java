package cn.ac.big.bigd.webservice.model.zabbix;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Real {
    private int itemid;
    @JsonFormat(timezone = "GMT+8")
    private Date time;
    private double value;
    private double gbps;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getGbps() {
        return gbps;
    }

    public void setGbps(double gbps) {
        this.gbps = gbps;
    }
}
