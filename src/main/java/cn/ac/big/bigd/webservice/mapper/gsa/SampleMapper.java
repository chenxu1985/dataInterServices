package cn.ac.big.bigd.webservice.mapper.gsa;
import java.util.List;
import cn.ac.big.bigd.webservice.model.gsa.Sample;
import cn.ac.big.bigd.webservice.model.gsa.SampleCounts;
import cn.ac.big.bigd.webservice.model.gsa.SampleReview;
import cn.ac.big.bigd.webservice.model.gsa.SampleSynchronization;

public interface SampleMapper {
    List<Sample> listAllSamplesByUserId(int userId);
    Sample getSampleByAccession(String accession);
    List<Sample> getSamplesByTerm(String name);
    List<Sample> getSamplesByTaxId(Integer taxId);
    List<Sample> listSamplesByPrjAcc(String accession);
    void updateReleaseStateById(int sampleId);
    int getPrjIdBySampleId(int sampleId);
    List<Sample> getSamplesByTag(String tag);
    Sample findSampleById(int sampleId);
    int releaseSampleStatus(Sample sample);
    Sample getSampleByUuid(Sample sample);
    Sample getSampleIdByAccession(String accession);
    List<SampleCounts> getSampleCountsType1(String countryName);
    List<SampleCounts> getSampleCountsType7(String countryName);
    List<SampleCounts> getSampleCountsType8(String countryName);
    List<SampleCounts> getSampleCountsTypeAll1(String countryName);
    List<SampleCounts> getSampleCountsTypeAll7(String countryName);
    List<SampleCounts> getSampleCountsTypeAll8(String countryName);
    int getTaxonCount(String name_txt);
    int getTaxonId(String name_txt);

    int reviewSample(SampleReview sample);

    int saveSampleByHuman(SampleSynchronization sample);

    int getSampleCountByPrjIdNoDelete(int prjId);

    String getSampleAccessionBySubmissionId(String submissionId);
    List<String> getSampleAccessionListBySubmissionId(String submissionId);
    String getSampleAccessionBySampleId(int sampleId);
}
