package org.javatop.tools.common.result;

import lombok.Getter;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-01 9:51
 * @description : 统一响应结果 状态码
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200,"操作成功"),
    FAIL(500, "操作失败"),

    SERVICE_ERROR(2012, "服务异常"),
    DATA_ERROR(204, "数据异常"),
    ILLEGAL_REQUEST(205, "非法请求"),
    REPEAT_SUBMIT(206, "重复提交"),

    LOGIN_AUTH(208, "未登陆"),
    PERMISSION(209, "没有权限"),

    ;

    private  Integer code;

    private  String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
