package com.cos.blog.service;

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

        user.setPassword(encPassword);

        userRepository.save(user);
    }

    @Transactional
    public void 회원수정(User user){
        User persistance = userRepository.findById(user.getId()).orElseThrow(() ->{
            return new IllegalArgumentException("회원 찾기 실패");
        });

        String rawPassword = user.getPassword(); //원문
        String encPassword = encoder.encode(rawPassword);   //해쉬

        persistance.setPassword(encPassword);
        persistance.setEmail(user.getEmail());

        userRepository.update(persistance);
    }

    @Transactional
    public User 회원찾기(String username){
        User user = userRepository.findByUsername(username).orElseGet(() -> {
            return new User();
        });
        return user;
    }


//    @Transactional
//    public User 로그인(User user) {
//      return userRepository.finByUsernameAndPassword(user.getUsername(),user.getPassword());
//    }
}
