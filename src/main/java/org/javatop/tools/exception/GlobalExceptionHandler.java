package org.javatop.tools.exception;

import lombok.extern.slf4j.Slf4j;
import org.javatop.tools.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-02-01 14:37
 * @description : 自定义全局异常
 * //AOP 面向切面
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 异常处理器
     * @param e exception
     * @return Result
     * 返回json数据
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        log.error("error message :{}",e.getMessage());
        return Result.error(null);
    }

    /**
     * 自定义异常处理
     * @param exception 异常
     * @return
     * 返回json数据
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result error(BusinessException exception) {
        return Result.build(null,exception.getCode(),exception.getMessage());
    }
}
