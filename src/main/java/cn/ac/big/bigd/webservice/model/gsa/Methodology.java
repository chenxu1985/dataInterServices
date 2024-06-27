package cn.ac.big.bigd.webservice.model.gsa;

public class Methodology {
    private int methodologyId;
    private String methodologyName;
    private int isOther;
    public int getIsOther() {
        return isOther;
    }
    public Methodology(int methodologyId) {
        super();
        this.methodologyId = methodologyId;
    }
    public void setIsOther(int isOther) {
        this.isOther = isOther;
    }
    public int getMethodologyId() {
        return methodologyId;
    }
    @Override
    public String toString() {
        return "Methodology [methodologyId=" + methodologyId
                + ", methodologyName=" + methodologyName + "]";
    }
    public Methodology() {
        super();
    }
    public Methodology(int methodologyId, String methodologyName) {
        super();
        this.methodologyId = methodologyId;
        this.methodologyName = methodologyName;
    }
    public void setMethodologyId(int methodologyId) {
        this.methodologyId = methodologyId;
    }
    public String getMethodologyName() {
        return methodologyName;
    }
    public void setMethodologyName(String methodologyName) {
        this.methodologyName = methodologyName;
    }
}
