package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.*;

import java.util.Map;

import java.util.List;

public interface GsaMapper {
    List<GSAForBioOne> selectRecordsByReleaseDate(Map<String,String> params);
    List<Cra> getCraListBySampleId(int sampleId);
    List<GsaBrowse> getGsaBrowseList();
    Cra selectCraByProjectAccession(String accession);
    List<DataList> getGsaAccession(List<Integer> prjIdList);
    FairDetail getFairDetailGsa(String accession);
    List<Fund> getFundGsa(int prjId);
    String getPrjId(String fundString);
    List<Integer> getPrjIdList(String fundString);
}
