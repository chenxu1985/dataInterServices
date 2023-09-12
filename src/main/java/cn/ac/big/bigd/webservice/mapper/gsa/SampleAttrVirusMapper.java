package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleAttrVirus;

public interface SampleAttrVirusMapper extends SampleAttrMapper {
    SampleAttrVirus findBySampleId(int sampleId);
}
