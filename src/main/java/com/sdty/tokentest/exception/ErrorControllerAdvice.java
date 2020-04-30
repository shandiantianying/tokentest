package com.sdty.tokentest.exception;

import com.sdty.tokentest.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.SignatureException;
import java.util.Objects;

@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(SignatureException.class)
    @ResponseBody
    public Result handleValidException(SignatureException e){
        //日志记录错误信息
        //将错误信息返回给前台
        return Result.error(103, Objects.requireNonNull(e.getMessage()));
    }
}
