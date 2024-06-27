package cn.ac.big.bigd.webservice.model.gsa;

import java.util.List;

public class JsonRelease {
    private int prjId;
    private List<Sample> sampleList;

    public int getPrjId() {
        return prjId;
    }

    public void setPrjId(int prjId) {
        this.prjId = prjId;
    }

    public List<Sample> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<Sample> sampleList) {
        this.sampleList = sampleList;
    }
}
