package org.javatop.tools.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.javatop.tools.common.result.ResultCodeEnum;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-01 14:37
 * @description : 自定义全局异常
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException{

    //异常状态码
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param message 错误消息
     * @param code  状态码
     */
    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }


    /**
     * 接收枚举类型对象
     * @param resultCodeEnum  resultCodeEnum
     * @return BusinessException
     */
    public BusinessException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

}
