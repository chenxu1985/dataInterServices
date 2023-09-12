package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMimsmeWater;

public interface SampleAttrMimsmeWaterMapper extends SampleAttrMapper {
    SampleAttrMimsmeWater findBySampleId(int sampleId);
}
