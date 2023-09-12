package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMicrobe;

public interface SampleAttrMicrobeMapper extends SampleAttrMapper{
    SampleAttrMicrobe findBySampleId(int sampleId);
}
