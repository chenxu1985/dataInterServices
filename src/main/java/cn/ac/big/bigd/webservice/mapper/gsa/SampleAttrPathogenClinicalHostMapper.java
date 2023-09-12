package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrPathogenClinicalHost;
import cn.ac.big.bigd.webservice.model.gsa.SampleAttrPathogenClinicalHostSynchronization;

public interface SampleAttrPathogenClinicalHostMapper extends SampleAttrMapper {
    SampleAttrPathogenClinicalHost findBySampleId(int sampleId);

    int saveSampleAttrPathogenClinicalHostByHuman(SampleAttrPathogenClinicalHostSynchronization sampleAttrPathogenClinicalHostSynchronization);
}
