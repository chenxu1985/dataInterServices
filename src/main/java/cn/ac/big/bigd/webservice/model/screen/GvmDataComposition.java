package cn.ac.big.bigd.webservice.model.screen;

public class GvmDataComposition {
    private int prjCount;
    private int type;
    private String organismClass;
    private double fileSize;

    public int getPrjCount() {
        return prjCount;
    }

    public void setPrjCount(int prjCount) {
        this.prjCount = prjCount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOrganismClass() {
        return organismClass;
    }

    public void setOrganismClass(String organismClass) {
        this.organismClass = organismClass;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}
