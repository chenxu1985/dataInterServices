package cn.ac.big.bigd.webservice.model.zabbix;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Traffic {
    private int itemid;
    @JsonFormat(timezone = "GMT+8")
    private Date time;
    private double value;
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
}
