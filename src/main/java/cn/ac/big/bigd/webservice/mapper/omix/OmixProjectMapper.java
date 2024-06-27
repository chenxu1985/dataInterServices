package cn.ac.big.bigd.webservice.mapper.omix;

import cn.ac.big.bigd.webservice.model.omix.ProjectTaxonomyOmix;

public interface OmixProjectMapper {
    ProjectTaxonomyOmix getOmixTaxonomy(int prjId);
    int getOmixCountByPrjIdNoDelete(int prjId);
}
