package cn.ac.big.bigd.webservice.model.gsa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SampleAttrPathogenEnvironmental {
    private Integer attributeId;  //primary key
    private String isolate;
    private String strain;
    private String collectedBy;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date collectionDate;
    private String geographicLocation;
    private String isolationSource;
    private String latitudeLongitude;
    private String cultureCollection;
    private String genotype;
    private String passageHistory;
    private String serovar;
    private String specimenVoucher;
    private String subgroup;
    private String subtype;
    private String addAttribute;
    public SampleAttrPathogenEnvironmental() {
        super();
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getIsolate() {
        return isolate;
    }

    public void setIsolate(String isolate) {
        this.isolate = isolate;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getCollectedBy() {
        return collectedBy;
    }

    public void setCollectedBy(String collectedBy) {
        this.collectedBy = collectedBy;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(String geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public String getIsolationSource() {
        return isolationSource;
    }

    public void setIsolationSource(String isolationSource) {
        this.isolationSource = isolationSource;
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }

    public String getCultureCollection() {
        return cultureCollection;
    }

    public void setCultureCollection(String cultureCollection) {
        this.cultureCollection = cultureCollection;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public String getPassageHistory() {
        return passageHistory;
    }

    public void setPassageHistory(String passageHistory) {
        this.passageHistory = passageHistory;
    }

    public String getSerovar() {
        return serovar;
    }

    public void setSerovar(String serovar) {
        this.serovar = serovar;
    }

    public String getSpecimenVoucher() {
        return specimenVoucher;
    }

    public void setSpecimenVoucher(String specimenVoucher) {
        this.specimenVoucher = specimenVoucher;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getAddAttribute() {
        return addAttribute;
    }

    public void setAddAttribute(String addAttribute) {
        this.addAttribute = addAttribute;
    }
}
