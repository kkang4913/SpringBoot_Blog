package com.cos.blog.config.auth;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PrincipalDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    // 스프링 시큐리티가 로그인 요청을 가로챌 때 username,password 변수를 가로채는데
    // password 처리는 자동으로 하므로 username이 DB에 있는지만 확인하면 됨
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username 들어오는지 확인" +   username);
        User principal = userRepository.findByUsername(username)
                .orElseThrow(() ->{
                    return  new UsernameNotFoundException("해당 사용자를 찾을 수 없습니다." + username);
                });
        return new PrincipalDetail(principal); //스프링 시큐리티 세션에 유저 정보가 저장됨
    }
}
