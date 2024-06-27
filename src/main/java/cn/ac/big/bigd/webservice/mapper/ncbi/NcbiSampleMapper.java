package cn.ac.big.bigd.webservice.mapper.ncbi;


import cn.ac.big.bigd.webservice.model.ncbi.SampleCountsNcbi;

import java.util.List;

public interface NcbiSampleMapper {
    List<SampleCountsNcbi> getSampleCounts(String countryName);
}
