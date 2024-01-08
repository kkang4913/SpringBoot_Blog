package com.cos.blog.service;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Transactional
    public void 회원가입(User user) {
        String rawPassword = user.getPassword(); //원문 패스워드
        String encPassword = encoder.encode(rawPassword); // 해쉬 암호화
        System.out.println("서비스");
        user.setPassword(encPassword);
        userRepository.save(user);
    }

//    @Transactional
//    public User 로그인(User user) {
//      return userRepository.finByUsernameAndPassword(user.getUsername(),user.getPassword());
//    }
}
