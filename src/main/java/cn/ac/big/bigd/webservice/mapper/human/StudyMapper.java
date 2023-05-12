package cn.ac.big.bigd.webservice.mapper.human;



import cn.ac.big.bigd.webservice.model.gsa.DataList;
import cn.ac.big.bigd.webservice.model.gsa.FairDetail;
import cn.ac.big.bigd.webservice.model.human.Study;

import java.util.List;

public interface StudyMapper {
    List<Study> getUnSynchronizationStudys();
    List<Study> getUnSynchronizationStudysList(List studyList);
    int updateSynchronizationByStudyId(int studyId);
    List<DataList> getHumanAccession(List<Integer> prjIdList);
    FairDetail getFairDetailHuman(String accession);
}
