package cn.ac.big.bigd.webservice.model.gsa;
import java.util.List;

public class Taxon3 {
    private Integer taxonId;
    private String name;
    private String ranks;
    private Integer dividedId;
    public Taxon3(int taxonId) {
        super();
        this.taxonId = taxonId;
    }
    public Taxon3() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getTaxonId() {
        return taxonId;
    }
    public void setTaxonId(String taxonId) {
        if(taxonId.trim().isEmpty()){
            this.taxonId = null;
            return;
        }
        Integer result = Integer.valueOf(taxonId);
        this.taxonId = result;
    }
    public void setTaxonId(Integer taxonId) {
        this.taxonId = taxonId;
    }
    public String getRanks() {
        return ranks;
    }
    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    public Integer getDividedId() {
        return dividedId;
    }

    public void setDividedId(Integer dividedId) {
        this.dividedId = dividedId;
    }
}
