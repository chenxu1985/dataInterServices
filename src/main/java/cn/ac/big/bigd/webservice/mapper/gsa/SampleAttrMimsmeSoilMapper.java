package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMimsmeSoil;

public interface SampleAttrMimsmeSoilMapper extends SampleAttrMapper {
    SampleAttrMimsmeSoil findBySampleId(int sampleId);
}
