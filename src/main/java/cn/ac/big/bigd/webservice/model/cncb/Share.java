package cn.ac.big.bigd.webservice.model.cncb;

public class Share {
    private String accession;
    private String hraUrl;
    private String hraTitle;
    private int passCnt;

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getHraUrl() {
        return hraUrl;
    }

    public void setHraUrl(String hraUrl) {
        this.hraUrl = hraUrl;
    }

    public String getHraTitle() {
        return hraTitle;
    }

    public void setHraTitle(String hraTitle) {
        this.hraTitle = hraTitle;
    }

    public int getPassCnt() {
        return passCnt;
    }

    public void setPassCnt(int passCnt) {
        this.passCnt = passCnt;
    }
}
