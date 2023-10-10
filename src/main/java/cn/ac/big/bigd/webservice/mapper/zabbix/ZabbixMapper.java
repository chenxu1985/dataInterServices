package cn.ac.big.bigd.webservice.mapper.zabbix;
import cn.ac.big.bigd.webservice.model.zabbix.Real;
import cn.ac.big.bigd.webservice.model.zabbix.Traffic;
import cn.ac.big.bigd.webservice.model.zabbix.TrafficHistoryDetail;

import java.util.List;

public interface ZabbixMapper {
    Real getUploadRealTime();
    Real getDownLoadRealTime();
    List<Traffic> getUploadRealDetail();
    List<Traffic> getDownLoadRealDetail();
    List<TrafficHistoryDetail> getUploadTrafficHistoryList(int day);
    List<TrafficHistoryDetail> getDownLoadTrafficHistoryList(int day);
    double getUploadTraffic(int day);
    double getDownLoadTraffic(int day);

}
