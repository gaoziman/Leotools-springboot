package org.javatop.tools.controller;

import org.javatop.tools.domain.User;
import org.javatop.tools.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * (user)表控制层
 *
 * @author 程序员Leo
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public User selectOne(@PathVariable Integer id) {
        return userServiceImpl.selectById(id);
    }
}
