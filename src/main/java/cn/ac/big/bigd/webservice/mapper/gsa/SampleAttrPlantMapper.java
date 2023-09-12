package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrPlant;

public interface SampleAttrPlantMapper extends SampleAttrMapper {
    SampleAttrPlant findBySampleId(int sampleId);
}
