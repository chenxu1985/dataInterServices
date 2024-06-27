package cn.ac.big.bigd.webservice.model.gsa;

public class Capture {
    private int captureId;
    private String captureName;
    private int isOther;
    public int getIsOther() {
        return isOther;
    }
    public Capture(int captureId) {
        super();
        this.captureId = captureId;
    }
    public void setIsOther(int isOther) {
        this.isOther = isOther;
    }
    @Override
    public String toString() {
        return "Capture [captureId=" + captureId + ", captureName="
                + captureName + "]";
    }
    public int getCaptureId() {
        return captureId;
    }
    public void setCaptureId(int captureId) {
        this.captureId = captureId;
    }
    public String getCaptureName() {
        return captureName;
    }
    public void setCaptureName(String captureName) {
        this.captureName = captureName;
    }
    public Capture() {
        super();
    }
    public Capture(int captureId, String captureName) {
        super();
        this.captureId = captureId;
        this.captureName = captureName;
    }
}
