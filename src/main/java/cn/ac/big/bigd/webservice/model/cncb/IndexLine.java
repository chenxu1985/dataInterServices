package cn.ac.big.bigd.webservice.model.cncb;

import java.util.List;

public class IndexLine {
    private List<String> dateList;
    private List<Double> fileList;
    private int maxPb;

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public List<Double> getFileList() {
        return fileList;
    }

    public void setFileList(List<Double> fileList) {
        this.fileList = fileList;
    }

    public int getMaxPb() {
        return maxPb;
    }

    public void setMaxPb(int maxPb) {
        this.maxPb = maxPb;
    }
}
