package org.javatop.tools.service.impl;

import cn.hutool.core.util.ObjectUtil;
import org.javatop.tools.common.result.Result;
import org.javatop.tools.common.result.ResultCodeEnum;
import org.javatop.tools.utils.JwtUtil;
import org.javatop.tools.utils.Md5Util;
import org.javatop.tools.utils.RedisCache;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.javatop.tools.mapper.UserMapper;
import org.javatop.tools.model.domain.User;
import org.javatop.tools.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-25 11:17
 * @description :
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisCache redisCache;

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


    /**
     * 登录接口
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回结果
     */
    @Override
    public Result login(String username, String password) {
        // 1. 查询用户是否存在
        User user = userMapper.selectByUsername(username);
        if (ObjectUtil.isNotNull(user)) {
            // 2.  校验密码是否正确
            if (Md5Util.checkPassword(password,user.getPassword())) {
                //3.生成token
                Map<String, Object> claims = new HashMap<>();
                claims.put("id", user.getId());
                claims.put("username", username);
                String token = JwtUtil.generateToken(claims);
                //4. 把token存入redis中
                String key =  "login:" + user.getId();
                redisCache.setKey(key,token,1, TimeUnit.HOURS);
                return Result.build(token, ResultCodeEnum.LOGIN_SUCCESS);
            } else {
                return Result.build(null, ResultCodeEnum.PASSWROD_ERROR);
            }
        }
        return Result.build(null, ResultCodeEnum.USER_NOT_FOUND);
    }
}
