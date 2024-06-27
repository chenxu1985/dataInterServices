package cn.ac.big.bigd.webservice.model.gsa;

public class SampleScope {
    private int sampleScopeId;
    private String sampleScopeName;
    private int isOther;
    public int getIsOther() {
        return isOther;
    }
    public SampleScope(int sampleScopeId) {
        super();
        this.sampleScopeId = sampleScopeId;
    }
    public void setIsOther(int isOther) {
        this.isOther = isOther;
    }
    @Override
    public String toString() {
        return "SampleScope [sampleScopeId=" + sampleScopeId
                + ", sampleScopeName=" + sampleScopeName + "]";
    }
    public SampleScope() {
        super();
    }
    public SampleScope(int sampleScopeId, String sampleScopeName) {
        super();
        this.sampleScopeId = sampleScopeId;
        this.sampleScopeName = sampleScopeName;
    }
    public int getSampleScopeId() {
        return sampleScopeId;
    }
    public void setSampleScopeId(int sampleScopeId) {
        this.sampleScopeId = sampleScopeId;
    }
    public String getSampleScopeName() {
        return sampleScopeName;
    }
    public void setSampleScopeName(String sampleScopeName) {
        this.sampleScopeName = sampleScopeName;
    }
}
