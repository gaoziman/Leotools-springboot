package org.javatop.tools.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javatop.tools.model.domain.User;

/**
 * @author : Leo
 * @date  2024-01-25 11:17
 * @version 1.0
 * @description :
 */

@Mapper
public interface UserMapper {
    int deleteById(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer id);

    int updateByCondition(User record);

    int updateById(User record);

    User selectByUsername(String username);
}