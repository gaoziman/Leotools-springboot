package org.javatop.tools.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.javatop.tools.mapper.UserMapper;
import org.javatop.tools.domain.User;
import org.javatop.tools.service.UserService;
/**
 * @author : Leo
 * @date  2024-01-25 11:17
 * @version 1.0
 * @description :
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public int updateByCondition(User record) {
        return userMapper.updateByCondition(record);
    }

    @Override
    public int updateById(User record) {
        return userMapper.updateById(record);
    }

}
