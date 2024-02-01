package org.javatop.tools.controller;

import org.javatop.tools.common.result.ResultCodeEnum;
import org.javatop.tools.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-29 11:48
 * @description : 登录接口
 */
@RestController
public class LoginController {

    @GetMapping("/login/{id}")
    public String login(@PathVariable Integer id) {
        return "login success";
    }
}
