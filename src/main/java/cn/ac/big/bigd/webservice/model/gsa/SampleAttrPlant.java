package cn.ac.big.bigd.webservice.model.gsa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SampleAttrPlant {
    private Integer attributeId;
    private String cultivar;
    private String biomaterialProvider;
    private String tissue;
    private String age;
    private String ageUnit;
    private String cellLine;
    private String cellType;
    private String collectedBy;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date collectionDate;
    private String cultureCollection;
    private String devStage;
    private String disease;
    private String diseaseStage;
    private String genotype;
    private String geographicLocation;
    private String growthProtocol;
    private String heightLength;
    private String isolationSource;
    private String latitudeLongitude;
    private String phenotype;
    private String population;
    private String type;
    private Integer sex;
    private String specimenVoucher;
    private String temperature;
    private String treatment;
    private String addAttribute;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getCultivar() {
        return cultivar;
    }

    public void setCultivar(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getBiomaterialProvider() {
        return biomaterialProvider;
    }

    public void setBiomaterialProvider(String biomaterialProvider) {
        this.biomaterialProvider = biomaterialProvider;
    }

    public String getTissue() {
        return tissue;
    }

    public void setTissue(String tissue) {
        this.tissue = tissue;
    }

    public String getCellLine() {
        return cellLine;
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
        this.ageUnit = ageUnit;
    }

    public void setCellLine(String cellLine) {
        this.cellLine = cellLine;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
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

    public String getCultureCollection() {
        return cultureCollection;
    }

    public void setCultureCollection(String cultureCollection) {
        this.cultureCollection = cultureCollection;
    }

    public String getDevStage() {
        return devStage;
    }

    public void setDevStage(String devStage) {
        this.devStage = devStage;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDiseaseStage() {
        return diseaseStage;
    }

    public void setDiseaseStage(String diseaseStage) {
        this.diseaseStage = diseaseStage;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public String getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(String geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public String getGrowthProtocol() {
        return growthProtocol;
    }

    public void setGrowthProtocol(String growthProtocol) {
        this.growthProtocol = growthProtocol;
    }

    public String getHeightLength() {
        return heightLength;
    }

    public void setHeightLength(String heightLength) {
        this.heightLength = heightLength;
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

    public String getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(String phenotype) {
        this.phenotype = phenotype;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAddAttribute() {
        return addAttribute;
    }

    public void setAddAttribute(String addAttribute) {
        this.addAttribute = addAttribute;
    }
}
