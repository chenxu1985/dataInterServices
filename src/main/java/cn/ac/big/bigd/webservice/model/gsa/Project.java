package cn.ac.big.bigd.webservice.model.gsa;
import java.util.Date;
import java.util.List;

public class Project {
    private String accession;
    private String biomaterialProvider;
    private Capture capture;
    private String consertiumName;
    private String consertiumUrl;
    private Date createTime;
    private List<DataType> dataTypes;
    private String description;
    private Material material;
    private Methodology methodology;
    private Date modifyTime;
    private String note;
    private int prjId;
    private Date releaseTime;
    private String relevance;
    private SampleScope sampleScope;
    private int status;
    private Submitter submitter;
    private Taxon taxon;
    private String title;
    private Integer userId;
    private String email;
    private User user;
    private Date deleteTime;
    private int isReleaseImmediately;
    private Integer supPrjId;
    private SuperProject superProject;
    private String casUserId;
    public Integer getSupPrjId() {
        return supPrjId;
    }
    public void setSupPrjId(Integer supPrjId) {
        this.supPrjId = supPrjId;
    }
    private int isShared;
    private String shareCode;
    private int shareId;
    private int releaseState;
    public String getSubmissionId(){
        return "subPRO" + this.zeroFill(prjId);
    }
    private String zeroFill(int num){
        int n = 6;
        int r = 0;
        String result = num + "";
        while(num >= 1){
            num = num/10;
            r++;
        }
        if(r>=n){
            return result;
        }else{
            for(int i=0; i < n-r; i++){
                result = "0"+result;
            }
            return result;
        }
    }

    public int getReleaseState() {
        return releaseState;
    }
    public void setReleaseState(int releaseState) {
        this.releaseState = releaseState;
    }
    private List<Sample> samples;

    public int getIsReleaseImmediately() {
        return isReleaseImmediately;
    }
    public void setIsReleaseImmediately(int isReleaseImmediately) {
        this.isReleaseImmediately = isReleaseImmediately;
    }
    public Date getDeleteTime() {
        return deleteTime;
    }
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
    public Project() {
        super();
    }
    public Project(int prjId) {
        super();
        this.prjId = prjId;
    }

    @Override
    public String toString() {
        return "Project [accession=" + accession + ", biomaterialProvider="
                + biomaterialProvider + ", capture=" + capture
                + ", consertiumName=" + consertiumName + ", consertiumUrl="
                + consertiumUrl + ", createTime=" + createTime
                + ", description=" + description + ", material="
                + material + ", methodology=" + methodology + ", modifyTime="
                + modifyTime + ", note=" + note + ", prjId=" + prjId
                + ", releaseTime=" + releaseTime + ", relevance=" + relevance
                + ", sampleScope=" + sampleScope + ", status=" + status
                + ", submitter=" + submitter + ", taxon=" + taxon + ", title="
                + title + ", user=" + user + ", deleteTime=" + deleteTime + "]";
    }
    public String getAccession() {
        return accession;
    }
    public void setAccession(String accession) {
        this.accession = accession;
    }
    public String getBiomaterialProvider() {
        return biomaterialProvider;
    }
    public void setBiomaterialProvider(String biomaterialProvider) {
        this.biomaterialProvider = biomaterialProvider;
    }
    public Capture getCapture() {
        return capture;
    }
    public void setCapture(Capture capture) {
        this.capture = capture;
    }
    public String getConsertiumName() {
        return consertiumName;
    }
    public void setConsertiumName(String consertiumName) {
        this.consertiumName = consertiumName;
    }
    public String getConsertiumUrl() {
        return consertiumUrl;
    }
    public void setConsertiumUrl(String consertiumUrl) {
        this.consertiumUrl = consertiumUrl;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public List<DataType> getDataTypes() {
        return dataTypes;
    }
    public void setDataTypes(List<DataType> dataTypes) {
        this.dataTypes = dataTypes;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public Methodology getMethodology() {
        return methodology;
    }
    public void setMethodology(Methodology methodology) {
        this.methodology = methodology;
    }
    public Date getModifyTime() {
        return modifyTime;
    }
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getPrjId() {
        return prjId;
    }
    public void setPrjId(int prjId) {
        this.prjId = prjId;
    }
    public Date getReleaseTime() {
        return releaseTime;
    }
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }
    public String getRelevance() {
        return relevance;
    }
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }
    public SampleScope getSampleScope() {
        return sampleScope;
    }
    public void setSampleScope(SampleScope sampleScope) {
        this.sampleScope = sampleScope;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Submitter getSubmitter() {
        return submitter;
    }
    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }
    public Taxon getTaxon() {
        return taxon;
    }
    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<Sample> getSamples() {
        return samples;
    }
    public void setSamples(List<Sample> samples) {
        this.samples = samples;
    }
    public int getIsShared() {
        return isShared;
    }
    public void setIsShared(int isShared) {
        this.isShared = isShared;
    }
    public String getShareCode() {
        return shareCode;
    }
    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
        if(shareCode !=null && !shareCode.equals("")){
            this.isShared=1;
        }
    }
    public int getShareId() {
        return shareId;
    }
    public void setShareId(int shareId) {
        this.shareId = shareId;
    }
    public SuperProject getSuperProject() {
        return superProject;
    }
    public void setSuperProject(SuperProject superProject) {
        this.superProject = superProject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCasUserId() {
        return casUserId;
    }

    public void setCasUserId(String casUserId) {
        this.casUserId = casUserId;
    }
}
