package cn.ac.big.bigd.webservice.mapper.ncbi;

import java.util.List;
import java.util.Map;

public interface NcbiMapper {
    int selectMaxPb();
    Double getFileSizeByDate(Map<String,String> params);
}
