package com.cos.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice   // 스프링 프레임워크에서 제공하는 어노테이션으로 예외처리 및 바인딩 설정을 제공
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String handleArgumentException(Exception e){
        return "<h1>" + e.getMessage() + "</h1>";
    }
}
