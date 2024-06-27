package cn.ac.big.bigd.webservice.model.gsa;

public class Material {
    private int materialId;
    private String materialName;
    private int isOther;
    public int getIsOther() {
        return isOther;
    }
    public Material(int materialId) {
        super();
        this.materialId = materialId;
    }
    public void setIsOther(int isOther) {
        this.isOther = isOther;
    }
    @Override
    public String toString() {
        return "Material [materialId=" + materialId + ", materialName="
                + materialName + "]";
    }
    public Material() {
        super();
    }
    public Material(int materialId, String materialName) {
        super();
        this.materialId = materialId;
        this.materialName = materialName;
    }
    public int getMaterialId() {
        return materialId;
    }
    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }
    public String getMaterialName() {
        return materialName;
    }
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
