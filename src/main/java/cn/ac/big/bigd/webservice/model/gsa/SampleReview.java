package cn.ac.big.bigd.webservice.model.gsa;

import java.util.Date;
import java.util.List;

public class SampleReview {
    private int sampleId;
    private String accession;
    private Submitter submitter;
    private String name;
    private Integer taxonId;
    private Taxon taxon;
    private SampleType sampleType;
    private String title;
    private Object sampleAttribute;
    private int userId;
    private String publicDescription;
    private List<Experiment> experimentList;
    private Integer releaseState;
    private Integer prjId;
    private String casUserId;
    private String sampleTypeString;
    private Integer status;
    private Date modifyTime;
    public SampleReview() {
        super();
    }

    public SampleReview(int sampleId) {
        super();
        this.sampleId = sampleId;
    }

    public SampleReview(int sampleId, String name) {
        super();
        this.sampleId = sampleId;
        this.name = name;
    }

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

    public Submitter getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Taxon getTaxon() {
        return taxon;
    }

    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }

    public SampleType getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getSampleAttribute() {
        return sampleAttribute;
    }

    public void setSampleAttribute(Object sampleAttribute) {
        this.sampleAttribute = sampleAttribute;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Experiment> getExperimentList() {
        return experimentList;
    }

    public void setExperimentList(List<Experiment> experimentList) {
        this.experimentList = experimentList;
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

    public String getCasUserId() {
        return casUserId;
    }

    public void setCasUserId(String casUserId) {
        this.casUserId = casUserId;
    }

    public String getSampleTypeString() {
        return sampleTypeString;
    }

    public void setSampleTypeString(String sampleTypeString) {
        this.sampleTypeString = sampleTypeString;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
