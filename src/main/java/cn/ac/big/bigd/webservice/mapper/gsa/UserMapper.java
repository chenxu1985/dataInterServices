package cn.ac.big.bigd.webservice.mapper.gsa;

import cn.ac.big.bigd.webservice.model.gsa.User;

public interface UserMapper {
   User selectUserByEmail(String email);
   int insertHumanUser(User user);
   User selectUserByCsaId(String casId);
}
