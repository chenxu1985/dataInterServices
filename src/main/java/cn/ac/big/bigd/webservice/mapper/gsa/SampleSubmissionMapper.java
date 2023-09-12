package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.SampleSubmission;

public interface SampleSubmissionMapper {
    SampleSubmission selectSubmissionBySubId(String subId);
    String selectSubmissionIdBySampleId(int sampleId);
    int updateSubmissionBySubId(String subId);
    int saveSampleSubmission(SampleSubmission samSub);
    int updateSampleSubmissionBySubmissionId(SampleSubmission samSub);
}
