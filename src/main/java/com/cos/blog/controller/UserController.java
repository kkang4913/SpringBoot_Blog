package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    /**
     * 회원가입 화면으로 이동하는 메서드
     * @return 회원가입 화면 joinForm.jsp
     */
    @GetMapping("/auth/joinForm")
    public String join(){
        return "user/joinForm";
    }

    /**
     * 로그인 화면으로 이동하는 메서드
     * @return 로그인 화면 joinForm.jsp
     */
    @GetMapping("/auth/loginForm")
    public String login(){
        return "user/loginForm";
    }

    @GetMapping("/user/updateForm")
    public String updateForm(){
        return "user/updateForm";
    }

}
