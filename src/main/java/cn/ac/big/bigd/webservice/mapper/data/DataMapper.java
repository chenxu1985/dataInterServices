package cn.ac.big.bigd.webservice.mapper.data;


import cn.ac.big.bigd.webservice.model.gsa.Fund;

import java.util.List;

public interface DataMapper {
    String getFund();
    String getFundPam();
    List<String> getFundList();
    List<cn.ac.big.bigd.webservice.model.data.Fund> getFundDetaiList();
}
