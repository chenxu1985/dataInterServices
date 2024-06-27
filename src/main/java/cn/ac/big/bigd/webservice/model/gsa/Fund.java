package cn.ac.big.bigd.webservice.model.gsa;

import java.util.Date;

public class Fund {
    public String grantId;
    public String funder;
    public String fundingName;


    public String getGrantId() {
        return grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    public String getFunder() {
        return funder;
    }

    public void setFunder(String funder) {
        this.funder = funder;
    }

    public String getFundingName() {
        return fundingName;
    }

    public void setFundingName(String fundingName) {
        this.fundingName = fundingName;
    }
}
