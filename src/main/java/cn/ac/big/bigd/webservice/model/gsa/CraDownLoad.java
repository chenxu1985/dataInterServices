package cn.ac.big.bigd.webservice.model.gsa;

import java.util.List;

public class CraDownLoad {
    private int craId;
    private String accession;
    private String title;
    private int status;

    public int getCraId() {
        return craId;
    }

    public void setCraId(int craId) {
        this.craId = craId;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
