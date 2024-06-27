package cn.ac.big.bigd.webservice.mapper.human;


import cn.ac.big.bigd.webservice.model.human.Sample;

import java.util.List;

public interface HumanSampleMapper {
    List<Sample> getUnSynchronizationSamples(int studyId);
    int updateBioSampleByAccession(Sample sample);

    List<Sample> getUnSynchronizationMetagenomeSamplesGut(int studyId);
    List<Sample> getUnSynchronizationMetagenomeSamplesNoGut(int studyId);
}
