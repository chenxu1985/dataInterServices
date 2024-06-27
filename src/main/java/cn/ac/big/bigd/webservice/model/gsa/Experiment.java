package cn.ac.big.bigd.webservice.model.gsa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Experiment {
    private Integer expId;
    private String accession;
    private Integer userId;
    private Integer prjId;
    private Integer sampleId;
    private Integer crpId;
    private Integer crsId;
    private Integer selectionId;
    private Integer platformId;
    private Integer strategyId;
    private Integer craId;
    private Integer sourceId;
    private String alias;
    private String title;
    private String libName;
    private String libLayout;
    private Integer libNominalSize;
    private Integer libNominalStandardDeviation;
    private Integer libInsertSize;
    private Integer plannedReadLength;
    private Integer plannedReadLengthMate1;
    private Integer plannedReadLengthMate2;
    private Integer plannedNumberOfCycles;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date createTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date modifyTime;
    private Integer status;
    private Integer isReleased;
    private Integer releaseState;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date releaseTime;
    private String libDesign;
    private Project project;
    private String proAcc;
    private String sampleAcc;
    private String crpAcc;
    private String crsAcc;
    private Sample sample;
    private ExpPlatform expPlatform;
    private Taxon taxon;
    private ExpLibSelection expLibSelection;
    private ExpLibSource expLibSource;
    private ExpLibStrategy expLibStrategy;
    private List<Experiment> relatedExperimentsByCraId;
    private String craAcc;
    private User user;
    //added by wangyanqing
    private int isShared;
    private String shareCode;
    private int shareId;
    private String statusString;
    private String releaseStateString;
    private Boolean isRunFileProcessing=false;
    //added by chenxu
    private List<Run> runs;
    private String url;

    private String expUrl;

    public Integer getExpId() {
        return expId;
    }
    public void setExpId(Integer expId) {
        this.expId = expId;
    }
    public String getAccession() {
        return accession;
    }
    public void setAccession(String accession) {
        this.accession = accession;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getPrjId() {
        return prjId;
    }
    public void setPrjId(Integer prjId) {
        this.prjId = prjId;
    }
    public Integer getSampleId() {
        return sampleId;
    }
    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public Integer getCrpId() {
        return crpId;
    }
    public Integer getCrsId() {
        return crsId;
    }
    public void setCrpId(Integer crpId) {
        this.crpId = crpId;
    }
    public void setCrsId(Integer crsId) {
        this.crsId = crsId;
    }
    public Integer getSelectionId() {
        return selectionId;
    }
    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }
    public Integer getPlatformId() {
        return platformId;
    }
    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }
    public Integer getStrategyId() {
        return strategyId;
    }
    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }
    public Integer getCraId() {
        return craId;
    }
    public void setCraId(Integer craId) {
        this.craId = craId;
    }
    public Integer getSourceId() {
        return sourceId;
    }
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLibName() {
        return libName;
    }
    public void setLibName(String libName) {
        this.libName = libName;
    }
    public String getLibLayout() {
        return libLayout;
    }
    public void setLibLayout(String libLayout) {
        if(libLayout.equals("1")) {
            this.libLayout="Fragment";
        } else if(libLayout.equals("2")) {
            this.libLayout = "Paired";
        } else {
            this.libLayout = libLayout;
        }
    }
    public Integer getLibNominalSize() {
        return libNominalSize;
    }
    public void setLibNominalSize(Integer libNominalSize) {
        this.libNominalSize = libNominalSize;
    }
    public Integer getLibNominalStandardDeviation() {
        return libNominalStandardDeviation;
    }
    public void setLibNominalStandardDeviation(Integer libNominalStandardDeviation) {
        this.libNominalStandardDeviation = libNominalStandardDeviation;
    }

    public Integer getLibInsertSize() {
        return libInsertSize;
    }
    public void setLibInsertSize(Integer libInsertSize) {
        this.libInsertSize = libInsertSize;
    }
    public Integer getPlannedReadLength() {
        return plannedReadLength;
    }
    public void setPlannedReadLength(String plannedReadLength) {
        if(plannedReadLength!=null && !plannedReadLength.equals("")){
            this.plannedReadLength =  Integer.parseInt(plannedReadLength);
        }else{
            this.plannedReadLength = 0;
        }

    }
    public Integer getPlannedReadLengthMate1() {
        return plannedReadLengthMate1;
    }
    public void setPlannedReadLengthMate1(String plannedReadLengthMate1) {
        if(plannedReadLengthMate1!=null && !plannedReadLengthMate1.equals(""))
            this.plannedReadLengthMate1 = Integer.parseInt(plannedReadLengthMate1);
        else
            this.plannedReadLengthMate1=0;
    }
    public Integer getPlannedReadLengthMate2() {
        return plannedReadLengthMate2;
    }
    public void setPlannedReadLengthMate2(String plannedReadLengthMate2) {
        if(plannedReadLengthMate2!=null && !plannedReadLengthMate2.equals(""))
            this.plannedReadLengthMate2 = Integer.parseInt(plannedReadLengthMate2);
        else
            this.plannedReadLengthMate2 = 0;
    }
    public Integer getPlannedNumberOfCycles() {
        return plannedNumberOfCycles;
    }
    public void setPlannedNumberOfCycles(String plannedNumberOfCycles) {
        if(plannedNumberOfCycles!=null && !plannedNumberOfCycles.equals("")){
            this.plannedNumberOfCycles = Integer.parseInt(plannedNumberOfCycles);
        }else{
            this.plannedNumberOfCycles = 0;
        }
    }
    public void setPlannedReadLength(Integer plannedReadLength) {
        this.plannedReadLength = plannedReadLength;
    }
    public void setPlannedReadLengthMate1(Integer plannedReadLengthMate1) {
        this.plannedReadLengthMate1 = plannedReadLengthMate1;
    }
    public void setPlannedReadLengthMate2(Integer plannedReadLengthMate2) {
        this.plannedReadLengthMate2 = plannedReadLengthMate2;
    }
    public void setPlannedNumberOfCycles(Integer plannedNumberOfCycles) {
        this.plannedNumberOfCycles = plannedNumberOfCycles;
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
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
        this.setStatusString(Status.StatusString[status]);
    }

    public Integer getIsReleased() {
        return isReleased;
    }
    public void setIsReleased(Integer isReleased) {
        this.isReleased = isReleased;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }
    public Integer getReleaseState() {
        return releaseState;
    }
    public void setReleaseState(Integer releaseState) {
        this.releaseState = releaseState;
        this.setReleaseStateString(Status.ReleaseStateString[releaseState]);
    }
    public void setReleaseTime(String releaseTime){
        if(releaseTime!=null && !releaseTime.equals("")){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try{
                this.releaseTime=dateFormat.parse(releaseTime);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public String getLibDesign() {
        return libDesign;
    }
    public void setLibDesign(String libDesign) {
        this.libDesign = libDesign;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public String getProAcc() {
        return proAcc;
    }
    public void setProAcc(String proAcc) {
        this.proAcc = proAcc;
    }
    public Sample getSample() {
        return sample;
    }
    public void setSample(Sample sample) {
        this.sample = sample;
    }
    public Taxon getTaxon() {
        return taxon;
    }
    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }
    public ExpLibSelection getExpLibSelection() {
        return expLibSelection;
    }
    public ExpLibSource getExpLibSource() {
        return expLibSource;
    }
    public ExpLibStrategy getExpLibStrategy() {
        return expLibStrategy;
    }
    public void setExpLibSelection(ExpLibSelection expLibSelection) {
        this.expLibSelection = expLibSelection;
    }
    public void setExpLibSource(ExpLibSource expLibSource) {
        this.expLibSource = expLibSource;
    }
    public void setExpLibStrategy(ExpLibStrategy expLibStrategy) {
        this.expLibStrategy = expLibStrategy;
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
    }
    public int getShareId() {
        return shareId;
    }
    public void setShareId(int shareId) {
        this.shareId = shareId;
    }
    public String getSampleAcc() {
        return sampleAcc;
    }
    public void setSampleAcc(String sampleAcc) {
        this.sampleAcc = sampleAcc;
    }
    public String getCrpAcc() {
        return crpAcc;
    }
    public String getCrsAcc() {
        return crsAcc;
    }
    public void setCrpAcc(String crpAcc) {
        this.crpAcc = crpAcc;
    }
    public void setCrsAcc(String crsAcc) {
        this.crsAcc = crsAcc;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public ExpPlatform getExpPlatform() {
        return expPlatform;
    }
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }
    public void setExpPlatform(ExpPlatform expPlatform) {
        this.expPlatform = expPlatform;
    }
    public String getStatusString() {
        return statusString;
    }
    public String getReleaseStateString() {
        return releaseStateString;
    }
    public void setStatusString(String statusString) {

        this.statusString = statusString;
    }
    public void setReleaseStateString(String releaseStateString) {

        this.releaseStateString = releaseStateString;
    }
    public List<Experiment> getRelatedExperimentsByCraId() {
        return relatedExperimentsByCraId;
    }
    public void setRelatedExperimentsByCraId(
            List<Experiment> relatedExperimentsByCraId) {
        this.relatedExperimentsByCraId = relatedExperimentsByCraId;
    }
    public Boolean getIsRunFileProcessing() {
        return isRunFileProcessing;
    }
    public void setIsRunFileProcessing(Boolean isRunFileProcessing) {
        this.isRunFileProcessing = isRunFileProcessing;
    }
    public List<Run> getRuns() {
        return runs;
    }
    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }
    public String getCraAcc() {
        return craAcc;
    }
    public void setCraAcc(String craAcc) {
        this.craAcc = craAcc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = "http://bigd.big.ac.cn/gsa/browse/"+this.craAcc+"/"+this.accession;
    }

    public String getExpUrl() {
        return expUrl;
    }

    public void setExpUrl(String expUrl) {
        this.expUrl = expUrl;
    }
}
