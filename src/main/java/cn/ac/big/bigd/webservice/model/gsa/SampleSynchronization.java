package cn.ac.big.bigd.webservice.model.gsa;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.List;

public class SampleSynchronization {
    private int sampleId;
    private String accession;
    private int userId;
    private Integer prjId;
    private Integer submitterId;
    private String name;
    private Integer taxonId;
    private int sampleTypeId;
    private int isControlled;
    private String title;
    private Date releaseTime;
    private String publicDescription;
    private Date createTime;
    private Integer status;
    private Integer releaseState;
    private Integer isReleaseImmediately;
    private String submissionId;
    private Integer submissionType;
    private Integer submissionStatus;
    private Integer batchOption;
    private Integer isSynchronization;
    private String  synchronizationAccession;
    private Date  synchronizationTime;
    private JSONObject attributes;
    private Integer isControlledAccess;

    private String otherDb;
    private String accessionInOtherDb;
    private String urlInOtherDb;

    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public Integer getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(Integer submitterId) {
        this.submitterId = submitterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSampleTypeId() {
        return sampleTypeId;
    }

    public void setSampleTypeId(int sampleTypeId) {
        this.sampleTypeId = sampleTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public Integer getTaxonId() {
        return taxonId;
    }

    public void setTaxonId(Integer taxonId) {
        this.taxonId = taxonId;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Integer getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Integer releaseState) {
        this.releaseState = releaseState;
    }

    public Integer getPrjId() {
        return prjId;
    }

    public void setPrjId(Integer prjId) {
        this.prjId = prjId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getIsControlled() {
        return isControlled;
    }

    public void setIsControlled(int isControlled) {
        this.isControlled = isControlled;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsReleaseImmediately() {
        return isReleaseImmediately;
    }

    public void setIsReleaseImmediately(Integer isReleaseImmediately) {
        this.isReleaseImmediately = isReleaseImmediately;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public Integer getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(Integer submissionType) {
        this.submissionType = submissionType;
    }

    public Integer getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(Integer submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public Integer getBatchOption() {
        return batchOption;
    }

    public void setBatchOption(Integer batchOption) {
        this.batchOption = batchOption;
    }

    public Integer getIsSynchronization() {
        return isSynchronization;
    }

    public void setIsSynchronization(Integer isSynchronization) {
        this.isSynchronization = isSynchronization;
    }

    public String getSynchronizationAccession() {
        return synchronizationAccession;
    }

    public void setSynchronizationAccession(String synchronizationAccession) {
        this.synchronizationAccession = synchronizationAccession;
    }

    public Date getSynchronizationTime() {
        return synchronizationTime;
    }

    public void setSynchronizationTime(Date synchronizationTime) {
        this.synchronizationTime = synchronizationTime;
    }

    public JSONObject getAttributes() {
        return attributes;
    }

    public void setAttributes(JSONObject attributes) {
        this.attributes = attributes;
    }

    public Integer getIsControlledAccess() {
        return isControlledAccess;
    }

    public void setIsControlledAccess(Integer isControlledAccess) {
        this.isControlledAccess = isControlledAccess;
    }

    public String getOtherDb() {
        return otherDb;
    }

    public void setOtherDb(String otherDb) {
        this.otherDb = otherDb;
    }

    public String getAccessionInOtherDb() {
        return accessionInOtherDb;
    }

    public void setAccessionInOtherDb(String accessionInOtherDb) {
        this.accessionInOtherDb = accessionInOtherDb;
    }

    public String getUrlInOtherDb() {
        return urlInOtherDb;
    }

    public void setUrlInOtherDb(String urlInOtherDb) {
        this.urlInOtherDb = urlInOtherDb;
    }
}
