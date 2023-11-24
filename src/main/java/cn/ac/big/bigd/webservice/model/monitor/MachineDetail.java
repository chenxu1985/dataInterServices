package cn.ac.big.bigd.webservice.model.monitor;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MachineDetail {
    private Date addTime;
    private Integer cpuUsage;
    private Integer memUsage;

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Integer getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(Integer memUsage) {
        this.memUsage = memUsage;
    }
}