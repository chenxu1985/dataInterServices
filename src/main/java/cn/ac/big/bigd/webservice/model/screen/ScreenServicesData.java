package cn.ac.big.bigd.webservice.model.screen;

public class ScreenServicesData {
    private String gsaData;
    private String InsdcData;
    private int patientIndividuals;
    private int naturalIndividuals;
    private int prjCnt;
    private int citeCnt;

    private DataComposition dataComposition;

    public String getGsaData() {
        return gsaData;
    }

    public void setGsaData(String gsaData) {
        this.gsaData = gsaData;
    }

    public String getInsdcData() {
        return InsdcData;
    }

    public void setInsdcData(String insdcData) {
        InsdcData = insdcData;
    }

    public int getPatientIndividuals() {
        return patientIndividuals;
    }

    public void setPatientIndividuals(int patientIndividuals) {
        this.patientIndividuals = patientIndividuals;
    }

    public int getNaturalIndividuals() {
        return naturalIndividuals;
    }

    public void setNaturalIndividuals(int naturalIndividuals) {
        this.naturalIndividuals = naturalIndividuals;
    }

    public DataComposition getDataComposition() {
        return dataComposition;
    }

    public void setDataComposition(DataComposition dataComposition) {
        this.dataComposition = dataComposition;
    }

    public int getPrjCnt() {
        return prjCnt;
    }

    public void setPrjCnt(int prjCnt) {
        this.prjCnt = prjCnt;
    }

    public int getCiteCnt() {
        return citeCnt;
    }

    public void setCiteCnt(int citeCnt) {
        this.citeCnt = citeCnt;
    }
}
