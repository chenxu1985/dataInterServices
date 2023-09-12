package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMimsmeHumanGut;
import cn.ac.big.bigd.webservice.model.gsa.SampleAttrMimsmeHumanGutSynchronization;

public interface SampleAttrMimsmeHumanGutMapper extends SampleAttrMapper {
    SampleAttrMimsmeHumanGut findBySampleId(int sampleId);
    int saveSampleAttrMimsmeHumanGutByHuman(SampleAttrMimsmeHumanGutSynchronization sampleAttrMimsmeHumanGutSynchronization);
}
