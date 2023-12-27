package com.cos.blog.controllerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>Hello Spring Boot</h1><br><h2>2023.10.19일</h2>";
    }
}
