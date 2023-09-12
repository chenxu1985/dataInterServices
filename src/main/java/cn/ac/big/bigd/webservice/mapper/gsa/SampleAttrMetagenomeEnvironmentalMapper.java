package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMetagenomeEnvironmental;
import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMetagenomeEnvironmentalSynchronization;

public interface SampleAttrMetagenomeEnvironmentalMapper extends SampleAttrMapper {
    SampleAttrMetagenomeEnvironmental findBySampleId(int sampleId);
    int saveSampleAttrMetagenomeEnvironmentalByHuman(SampleAttrMetagenomeEnvironmentalSynchronization sampleAttrMetagenomeEnvironmentalSynchronization);
}
