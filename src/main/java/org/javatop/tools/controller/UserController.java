package org.javatop.tools.controller;

import org.javatop.tools.service.impl.UserServiceImpl;
import org.javatop.tools.common.result.Result;
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
    public Result selectOne(@PathVariable Integer id) {
        return Result.success(userServiceImpl.selectById(id));
    }


}
