package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrPathogenEnvironmental;

public interface SampleAttrPathogenEnvironmentalMapper extends SampleAttrMapper {
    SampleAttrPathogenEnvironmental findBySampleId(int sampleId);
}
