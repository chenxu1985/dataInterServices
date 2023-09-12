package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.Experiment;

import java.util.List;
import java.util.Map;

public interface ExperimentMapper {
    List<Experiment> selectExperimentBySampleId(int  sampleId);
    List<Experiment> selectExperimentBySampleIdAndCraId(Map<String,Integer> params);
}
