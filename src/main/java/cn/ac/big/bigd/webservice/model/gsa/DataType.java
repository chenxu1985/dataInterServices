package cn.ac.big.bigd.webservice.model.gsa;

public class DataType {
    private int dataTypeId;
    private String dataTypeName;
    private int isOther;
    public int getIsOther() {
        return isOther;
    }
    public DataType(int dataTypeId) {
        super();
        this.dataTypeId = dataTypeId;
    }
    public void setIsOther(int isOther) {
        this.isOther = isOther;
    }
    @Override
    public String toString() {
        return "DataType [dataTypeId=" + dataTypeId + ", dataTypeName="
                + dataTypeName + "]";
    }
    public DataType() {
        super();
    }
    public DataType(int dataTypeId, String dataTypeName) {
        super();
        this.dataTypeId = dataTypeId;
        this.dataTypeName = dataTypeName;
    }
    public int getDataTypeId() {
        return dataTypeId;
    }
    public void setDataTypeId(int dataTypeId) {
        this.dataTypeId = dataTypeId;
    }
    public String getDataTypeName() {
        return dataTypeName;
    }
    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }
}
