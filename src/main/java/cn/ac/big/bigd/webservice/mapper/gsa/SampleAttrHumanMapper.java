package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrHuman;
import cn.ac.big.bigd.webservice.model.gsa.SampleAttrHumanSynchronization;

public interface SampleAttrHumanMapper extends SampleAttrMapper{
    SampleAttrHuman findBySampleId(int sampleId);

    int saveSampleAttrHumanByHuman(SampleAttrHumanSynchronization sampleAttrHumanSynchronization);
}
