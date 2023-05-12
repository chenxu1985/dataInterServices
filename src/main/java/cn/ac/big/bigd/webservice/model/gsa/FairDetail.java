package cn.ac.big.bigd.webservice.model.gsa;

import java.util.Date;
import java.util.List;

public class FairDetail {
    public String accession;
    public String type;
    public String title;
    public String version;
    public String description;
    public String keyword;
    public String subject;
    public Date datePublished;
    public Date dateModified;
    public String creativeWorkStatus;
    public String prjId;
    public String prjAccession;
    public String userName;
    public String email;
    public String org;

    public String url;
    public String accessRestrictions;
    public String fileNumber;
    public String fileSize;
    public String encodingFormat;
    public List<Fund> fund;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public List<Fund> getFund() {
        return fund;
    }

    public void setFund(List<Fund> fund) {
        this.fund = fund;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getCreativeWorkStatus() {
        return creativeWorkStatus;
    }

    public void setCreativeWorkStatus(String creativeWorkStatus) {
        this.creativeWorkStatus = creativeWorkStatus;
    }

    public String getPrjId() {
        return prjId;
    }

    public void setPrjId(String prjId) {
        this.prjId = prjId;
    }

    public String getPrjAccession() {
        return prjAccession;
    }

    public void setPrjAccession(String prjAccession) {
        this.prjAccession = prjAccession;
    }

    public String getAccessRestrictions() {
        return accessRestrictions;
    }

    public void setAccessRestrictions(String accessRestrictions) {
        this.accessRestrictions = accessRestrictions;
    }

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }
}
