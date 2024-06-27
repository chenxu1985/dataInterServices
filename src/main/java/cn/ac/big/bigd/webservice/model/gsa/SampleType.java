package cn.ac.big.bigd.webservice.model.gsa;

public class SampleType {
    private int sampleTypeId;
    private String attributeTable;
    private String sampleTypeName;
    @Override
    public String toString() {
        return "SampleType [sampleTypeId=" + sampleTypeId + ", attributeTable="  + attributeTable + "]";
    }
    public SampleType() {
        super();
    }
    public SampleType(int sampleTypeId, String attributeTable) {
        super();
        this.sampleTypeId = sampleTypeId;
        this.attributeTable = attributeTable;
    }
    public int getSampleTypeId() {
        return sampleTypeId;
    }
    public void setSampleTypeId(int sampleTypeId) {
        this.sampleTypeId = sampleTypeId;
    }
    public String getAttributeTable() {
        return attributeTable;
    }
    public void setAttributeTable(String attributeTable) {
        this.attributeTable = attributeTable;
    }
    public String getSampleTypeName() {
        return sampleTypeName;
    }
    public void setSampleTypeName(String sampleTypeName) {
        this.sampleTypeName = sampleTypeName;
    }
}
