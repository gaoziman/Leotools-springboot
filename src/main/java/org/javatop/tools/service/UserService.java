package org.javatop.tools.service;

import org.javatop.tools.common.result.Result;
import org.javatop.tools.model.domain.User;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-25 11:17
 * @description :
 */

public interface UserService {

    int deleteById(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer id);

    int updateByCondition(User record);

    int updateById(User record);

    /**
     * 登录接口
     * @param username 用户名
     * @param password 密码
     * @return 返回结果
     */
    Result login(String username, String password);
}
