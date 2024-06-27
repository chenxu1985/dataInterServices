package cn.ac.big.bigd.webservice.mapper.gsa;
import cn.ac.big.bigd.webservice.model.gsa.Taxon;
import cn.ac.big.bigd.webservice.model.gsa.Taxon2;
import cn.ac.big.bigd.webservice.model.gsa.Taxon3;

import java.util.List;
public interface TaxonMapper {
    List<Taxon2> selectAncestorsById(int taxonId);
    List<Integer> listTaxonIdsByScientificName(String term);
    List<Integer> getTaxonIdByParentId(int parentId);
    Taxon2 getGenusById(int taxonId);
    Taxon selectTaxonById(int taxonId);
    List<Taxon3> selectAncestors3ById(int taxonId);
    Taxon3 selectTaxon3ById(int taxonId);
}
