package cn.ac.big.bigd.webservice.model.gsa;

import java.util.List;

public class GsaBrowse {
    private String craAccession;
    private String craTitle;
    private String prjAccession;
    private int sampleCount;
    private int expCount;
    private int runCount;
    private String organization;
    private String releaseTime;

    public String getCraAccession() {
        return craAccession;
    }

    public void setCraAccession(String craAccession) {
        this.craAccession = craAccession;
    }

    public String getCraTitle() {
        return craTitle;
    }

    public void setCraTitle(String craTitle) {
        this.craTitle = craTitle;
    }

    public String getPrjAccession() {
        return prjAccession;
    }

    public void setPrjAccession(String prjAccession) {
        this.prjAccession = prjAccession;
    }

    public int getSampleCount() {
        return sampleCount;
    }

    public void setSampleCount(int sampleCount) {
        this.sampleCount = sampleCount;
    }

    public int getExpCount() {
        return expCount;
    }

    public void setExpCount(int expCount) {
        this.expCount = expCount;
    }

    public int getRunCount() {
        return runCount;
    }

    public void setRunCount(int runCount) {
        this.runCount = runCount;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }
}
