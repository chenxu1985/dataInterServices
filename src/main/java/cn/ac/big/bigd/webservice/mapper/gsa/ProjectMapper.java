package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.Project;
import cn.ac.big.bigd.webservice.model.gsa.ProjectTaxonomy;

import java.util.List;

public interface ProjectMapper {
    List<Project> listProjectsByUserId(int userId);
    void updateReleaseStateById(int prjId);
    Integer selectUserId(String email);
    Project findProjectById(Integer prjId);
    int releaseProject(Project project);
    Project getProjectByUuid(Project project);
    Project findProjectByAccession(String accession);
    List<Project> getReleaseList();
    ProjectTaxonomy getTaxonomy(int prjId);

    int releaseProjectWeb(Project project);
}
