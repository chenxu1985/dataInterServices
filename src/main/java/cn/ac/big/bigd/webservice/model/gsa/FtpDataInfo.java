package cn.ac.big.bigd.webservice.model.gsa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FtpDataInfo {
    private String accession;
    public Integer visitCount;
    public Float fileSize;
    public Date publishDate;
    public String publishDateString;
    public Integer fileCount;
    public Integer downloadCount;

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Float getFileSize() {
        return fileSize;
    }

    public void setFileSize(Float fileSize) {
        this.fileSize = fileSize;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(this.publishDate);
        setPublishDateString(dateStr);
    }

    public Integer getFileCount() {
        return fileCount;
    }

    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getPublishDateString() {
        return publishDateString;
    }

    public void setPublishDateString(String publishDateString) {
        this.publishDateString = publishDateString;
    }
}
