package cn.ac.big.bigd.webservice.model.zabbix;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TrafficHistoryDetail {
    private int itemid;
    @JsonFormat(timezone = "GMT+8")
    private Date time;
    private double valueMin;
    private double valueAvg;
    private double valueMax;

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

    public double getValueMin() {
        return valueMin;
    }

    public void setValueMin(double valueMin) {
        this.valueMin = valueMin;
    }

    public double getValueAvg() {
        return valueAvg;
    }

    public void setValueAvg(double valueAvg) {
        this.valueAvg = valueAvg;
    }

    public double getValueMax() {
        return valueMax;
    }

    public void setValueMax(double valueMax) {
        this.valueMax = valueMax;
    }
}
