package org.javatop.tools.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @date  2024-01-25 11:17
 * @version 1.0
 * @description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 用户编号
    */
    private Integer id;

    /**
    * 角色 0-管理员 1-普通用户
    */
    private String role;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 身份证号
    */
    private String idCard;

    /**
    * 手机号码
    */
    private String phone;

    /**
    * 性别 男或者女
    */
    private String gender;

    /**
    * 时间
    */
    private Date time;

    /**
    * 状态 0-异常 1-正常
    */
    private String status;
}