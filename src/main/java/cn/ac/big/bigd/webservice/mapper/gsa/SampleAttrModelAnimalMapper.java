package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrModelAnimal;

public interface SampleAttrModelAnimalMapper extends SampleAttrMapper {
    SampleAttrModelAnimal findBySampleId(int sampleId);
}
