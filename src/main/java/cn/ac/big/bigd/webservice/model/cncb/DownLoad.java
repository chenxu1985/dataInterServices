package cn.ac.big.bigd.webservice.model.cncb;

public class DownLoad {
    private int index;
    private String accession;
    private String craUrl;
    private String dataDes;
    private Long downloadSize;

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

    public String getCraUrl() {
        return craUrl;
    }

    public void setCraUrl(String craUrl) {
        this.craUrl = craUrl;
    }

    public String getDataDes() {
        return dataDes;
    }

    public void setDataDes(String dataDes) {
        this.dataDes = dataDes;
    }

    public Long getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Long downloadSize) {
        this.downloadSize = downloadSize;
    }
}
