package cn.ac.big.bigd.webservice.model.gsa;
import java.util.List;
public class Taxon {
    private Integer taxonId;
    private String name;
    private String ranks;
    private String genBankCommonName;
    private List<String> commonNames;
    private List<String> synonymNames;
    private List<Taxon2> ancestors; //for Lineage
    public Taxon(int taxonId) {
        super();
        this.taxonId = taxonId;
    }
    public Taxon() {
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
    public List<String> getCommonNames() {
        return commonNames;
    }
    public void setCommonNames(List<String> commonNames) {
        this.commonNames = commonNames;
    }
    public List<Taxon2> getAncestors() {
        return ancestors;
    }
    public void setAncestors(List<Taxon2> ancestors) {
        this.ancestors = ancestors;
    }
    public String getRanks() {
        return ranks;
    }
    public void setRanks(String ranks) {
        this.ranks = ranks;
    }
    public String getGenBankCommonName() {
        return genBankCommonName;
    }
    public void setGenBankCommonName(String genBankCommonName) {
        this.genBankCommonName = genBankCommonName;
    }
    public List<String> getSynonymNames() {
        return synonymNames;
    }
    public void setSynonymNames(List<String> synonymNames) {
        this.synonymNames = synonymNames;
    }
}
