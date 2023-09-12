package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.Run;

import java.util.List;

public interface RunMapper {
    List<Run> selectRunByExpId(int expId);
    List<Run> selectRunUrlByExpId(int expId);
}
