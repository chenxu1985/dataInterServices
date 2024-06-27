package cn.ac.big.bigd.webservice.model.gsa;
import java.util.Date;
public class SuperProject {
    private int supPrjId;
    private String accession;
    private String nameEn;
    private String nameCh;
    private int level;
    private int parentPrjId;
    private String principal;
    private String organization;
    private String sponsor;
    private int isLeaf;
    private Date createTime;
    private Date modifyTime;
    private int isDeleted;
    private int supPrjType;

    public int getSupPrjId() {
        return supPrjId;
    }
    public void setSupPrjId(int supPrjId) {
        this.supPrjId = supPrjId;
    }
    public String getAccession() {
        return accession;
    }
    public void setAccession(String accession) {
        this.accession = accession;
    }
    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameCh() {
        return nameCh;
    }
    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getParentPrjId() {
        return parentPrjId;
    }
    public void setParentPrjId(int parentPrjId) {
        this.parentPrjId = parentPrjId;
    }
    public String getPrincipal() {
        return principal;
    }
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public String getSponsor() {
        return sponsor;
    }
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    public int getIsLeaf() {
        return isLeaf;
    }
    public void setIsLeaf(int isLeaf) {
        this.isLeaf = isLeaf;
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
    public int getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public int getSupPrjType() {
        return supPrjType;
    }
    public void setSupPrjType(int supPrjType) {
        this.supPrjType = supPrjType;
    }
    @Override
    public String toString() {
        return "SuperProject [supPrjId=" + supPrjId + ", accession="
                + accession + ", nameEn=" + nameEn + ", nameCh=" + nameCh
                + ", level=" + level + ", parentPrjId=" + parentPrjId
                + ", principal=" + principal + ", organization=" + organization
                + "]";
    }
}
