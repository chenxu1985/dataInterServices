package cn.ac.big.bigd.webservice.mapper.ftp;

import cn.ac.big.bigd.webservice.model.cncb.DownLoad;

import java.util.List;

public interface FtpInfoMapper {
    List<DownLoad> getDownLoadCountCra();
    List<DownLoad> getDownLoadCountPrj();
}
