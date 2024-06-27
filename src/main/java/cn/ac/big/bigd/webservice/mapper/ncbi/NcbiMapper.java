package cn.ac.big.bigd.webservice.mapper.ncbi;

import java.util.List;
import java.util.Map;

public interface NcbiMapper {
    Double selectMaxPb();

    Double getFileSizeByDate(Map<String, String> params);

    Double getFileSizeAll();
}
