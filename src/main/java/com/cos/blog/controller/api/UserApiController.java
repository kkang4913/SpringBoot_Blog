package com.cos.blog.controller.api;

import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class UserApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth/joinProc")
    public ResponseDto<Integer> save(@RequestBody User user){
        System.out.println("UserApiController : save 함수 호출됨");
        log.info("userInfo={}",user);
        user.setRole(RoleType.USER);
        userService.회원가입(user);

        return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }

//    @PostMapping("/api/user/login")
//    public ResponseDto<Integer> login(@RequestBody User user, HttpSession session){
//        System.out.println("UserApiController : login 함수 호출");
//        User principal =userService.로그인(user); //principal = 사용자를 나타내는 접근주체
//
//        if (principal != null) session.setAttribute("principal",principal);
//        log.info("principal={}",principal);
//        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
//    }
}
