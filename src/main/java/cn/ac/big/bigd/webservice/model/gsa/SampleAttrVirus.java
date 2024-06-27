package cn.ac.big.bigd.webservice.model.gsa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SampleAttrVirus {
    private Integer attributeId;
    private String isolate;
    private String strain;
    private Integer hostTaxonId;
    private String hostTaxonName;
    private String labHost;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date collectionDate;
    private String geographicLocation;
    private String isolationSource;
    private String altitude;
    private String biomaterialProvider;
    private String collectedBy;
    private String cultureCollection;
    private String depth;
    private String disease;
    private String environmentBiome;
    private String genotype;
    private String hostTissueSampled;
    private String identifiedBy;
    private String latitudeLongitude;
    private String passageHistory;
    private String sampleSize;
    private String serotype;
    private String specimenVoucher;
    private String temperature;
    private String addAttribute;

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

    public Integer getHostTaxonId() {
        return hostTaxonId;
    }

    public void setHostTaxonId(Integer hostTaxonId) {
        this.hostTaxonId = hostTaxonId;
    }

    public String getLabHost() {
        return labHost;
    }

    public void setLabHost(String labHost) {
        this.labHost = labHost;
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

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getBiomaterialProvider() {
        return biomaterialProvider;
    }

    public void setBiomaterialProvider(String biomaterialProvider) {
        this.biomaterialProvider = biomaterialProvider;
    }

    public String getCollectedBy() {
        return collectedBy;
    }

    public void setCollectedBy(String collectedBy) {
        this.collectedBy = collectedBy;
    }

    public String getCultureCollection() {
        return cultureCollection;
    }

    public void setCultureCollection(String cultureCollection) {
        this.cultureCollection = cultureCollection;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getEnvironmentBiome() {
        return environmentBiome;
    }

    public void setEnvironmentBiome(String environmentBiome) {
        this.environmentBiome = environmentBiome;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public String getHostTissueSampled() {
        return hostTissueSampled;
    }

    public void setHostTissueSampled(String hostTissueSampled) {
        this.hostTissueSampled = hostTissueSampled;
    }

    public String getIdentifiedBy() {
        return identifiedBy;
    }

    public void setIdentifiedBy(String identifiedBy) {
        this.identifiedBy = identifiedBy;
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }

    public String getPassageHistory() {
        return passageHistory;
    }

    public void setPassageHistory(String passageHistory) {
        this.passageHistory = passageHistory;
    }

    public String getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(String sampleSize) {
        this.sampleSize = sampleSize;
    }

    public String getSerotype() {
        return serotype;
    }

    public void setSerotype(String serotype) {
        this.serotype = serotype;
    }

    public String getSpecimenVoucher() {
        return specimenVoucher;
    }

    public void setSpecimenVoucher(String specimenVoucher) {
        this.specimenVoucher = specimenVoucher;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getAddAttribute() {
        return addAttribute;
    }

    public void setAddAttribute(String addAttribute) {
        this.addAttribute = addAttribute;
    }

    public String getHostTaxonName() {
        return hostTaxonName;
    }

    public void setHostTaxonName(String hostTaxonName) {
        this.hostTaxonName = hostTaxonName;
    }
}
