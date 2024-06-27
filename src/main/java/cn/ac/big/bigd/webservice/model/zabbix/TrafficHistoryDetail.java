package cn.ac.big.bigd.webservice.model.zabbix;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TrafficHistoryDetail {
    private int itemid;

    private String time;
    private double avg;
//    private double valueAvg;
//    private double valueMax;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
