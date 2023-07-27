package cn.ac.big.bigd.webservice.model.gsa;

import java.util.List;

public class CraDownLoad {
    private int craId;
    private String accession;
    private String title;
    private String desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
