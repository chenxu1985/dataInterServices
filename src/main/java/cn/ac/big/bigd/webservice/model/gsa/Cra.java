package cn.ac.big.bigd.webservice.model.gsa;

import java.util.List;

public class Cra {
    private int craId;
    private String craAccession;
    private String craUrl;
    private List<Experiment> experimentList;

    public int getCraId() {
        return craId;
    }

    public void setCraId(int craId) {
        this.craId = craId;
    }

    public String getCraAccession() {
        return craAccession;
    }

    public void setCraAccession(String craAccession) {
        this.craAccession = craAccession;
    }

    public String getCraUrl() {
        return craUrl;
    }

    public void setCraUrl(String craUrl) {
        this.craUrl = craUrl;
    }

    public List<Experiment> getExperimentList() {
        return experimentList;
    }

    public void setExperimentList(List<Experiment> experimentList) {
        this.experimentList = experimentList;
    }
}
