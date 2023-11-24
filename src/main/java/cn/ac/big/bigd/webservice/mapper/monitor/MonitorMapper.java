package cn.ac.big.bigd.webservice.mapper.monitor;
import cn.ac.big.bigd.webservice.model.monitor.Machine;
import cn.ac.big.bigd.webservice.model.monitor.MachineDetail;
import cn.ac.big.bigd.webservice.model.zabbix.Real;
import cn.ac.big.bigd.webservice.model.zabbix.Traffic;
import cn.ac.big.bigd.webservice.model.zabbix.TrafficAvgDetail;
import cn.ac.big.bigd.webservice.model.zabbix.TrafficHistoryDetail;

import java.util.List;

public interface MonitorMapper {
    Machine getMachineLog();
    List<MachineDetail> getMachineList();

}
