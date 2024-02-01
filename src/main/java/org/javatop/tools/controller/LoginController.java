package org.javatop.tools.controller;

import org.javatop.tools.common.result.Result;
import org.javatop.tools.common.result.ResultCodeEnum;
import org.javatop.tools.exception.BusinessException;
import org.javatop.tools.service.UserService;
import org.javatop.tools.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-29 11:48
 * @description : 登录接口
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;


    /**
     * 登录接口
     * @param username 用户名
     * @param password 密码
     * @return 返回结果
     */
    @PostMapping("/login")
    public Result login(String username, String password) {
        return userService.login(username, password);
    }
}
