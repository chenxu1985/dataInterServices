package cn.ac.big.bigd.webservice.model.gsa;

public class DataList {
    public String id;

    public String publishDate;

    public String downloadUrl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        if(!publishDate.equals("-")){
            this.publishDate = publishDate.substring(0,10);
        } else {
            this.publishDate = publishDate;
        }
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
