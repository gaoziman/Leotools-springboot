package org.javatop.tools.service;

import org.javatop.tools.domain.User;
    /**
 * @author : Leo
 * @date  2024-01-25 11:17
 * @version 1.0
 * @description :
 */

public interface UserService{

    int deleteById(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer id);

    int updateByCondition(User record);

    int updateById(User record);

}
