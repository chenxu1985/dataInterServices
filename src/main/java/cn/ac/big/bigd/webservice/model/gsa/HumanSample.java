package cn.ac.big.bigd.webservice.model.gsa;


import java.util.Date;

public class HumanSample {
    private Integer sampleId;

    private Integer studyId;

    private Integer individualId;

    private String name;

    private String accession;

    private Integer biosampleId;

    private String biosampleAccession;

    private String title;

    private String tissue;

    private String age;

    private String ageUnit;

    private String publicDescription;

    private String collectionDate;

    private String karyotype;

    private String phenotype;

    private String population;

    private Integer status;

    private Integer releaseState;

    private Date createTime;

    private Date modifyTime;

    private Date releaseTime;

    private Date archivedTime;

    private Date deleteTime;

    private Byte isTransferedToBiosample;

    private Integer isControlledAccess;

    private Integer validate;

    private String statusString;
    private String releaseStateString;
    private String statusClass;

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

    public Integer getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Integer individualId) {
        this.individualId = individualId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession == null ? null : accession.trim();
    }

    public Integer getBiosampleId() {
        return biosampleId;
    }

    public void setBiosampleId(Integer biosampleId) {
        this.biosampleId = biosampleId;
    }

    public String getBiosampleAccession() {
        return biosampleAccession;
    }

    public void setBiosampleAccession(String biosampleAccession) {
        this.biosampleAccession = biosampleAccession == null ? null : biosampleAccession.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTissue() {
        return tissue;
    }

    public void setTissue(String tissue) {
        this.tissue = tissue == null ? null : tissue.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription == null ? null : publicDescription.trim();
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate == null ? null : collectionDate.trim();
    }

    public String getKaryotype() {
        return karyotype;
    }

    public void setKaryotype(String karyotype) {
        this.karyotype = karyotype == null ? null : karyotype.trim();
    }

    public String getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(String phenotype) {
        this.phenotype = phenotype == null ? null : phenotype.trim();
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population == null ? null : population.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getArchivedTime() {
        return archivedTime;
    }

    public void setArchivedTime(Date archivedTime) {
        this.archivedTime = archivedTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Byte getIsTransferedToBiosample() {
        return isTransferedToBiosample;
    }

    public void setIsTransferedToBiosample(Byte isTransferedToBiosample) {
        this.isTransferedToBiosample = isTransferedToBiosample;
    }

    public Integer getIsControlledAccess() {
        return isControlledAccess;
    }

    public void setIsControlledAccess(Integer isControlledAccess) {
        this.isControlledAccess = isControlledAccess;
    }

    public Integer getValidate() {
        return validate;
    }

    public void setValidate(Integer validate) {
        this.validate = validate;
    }

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    public String getReleaseStateString() {
        return releaseStateString;
    }

    public void setReleaseStateString(String releaseStateString) {
        this.releaseStateString = releaseStateString;
    }

    public String getStatusClass() {
        return statusClass;
    }

    public void setStatusClass(String statusClass) {
        this.statusClass = statusClass;
    }
}