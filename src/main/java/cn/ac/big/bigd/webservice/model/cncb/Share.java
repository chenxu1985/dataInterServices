package cn.ac.big.bigd.webservice.model.cncb;

public class Share {
    private int index;
    private String accession;
    private String hraUrl;
    private String hraTitle;
    private int passCnt;
    private int requestCnt;
    private int effCnt;
    private int rating;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

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

    public int getRequestCnt() {
        return requestCnt;
    }

    public void setRequestCnt(int requestCnt) {
        this.requestCnt = requestCnt;
    }

    public int getEffCnt() {
        return effCnt;
    }

    public void setEffCnt(int effCnt) {
        this.effCnt = effCnt;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
