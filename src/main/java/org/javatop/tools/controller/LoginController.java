package org.javatop.tools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-01-29 11:48
 * @description :
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login success";
    }
}
