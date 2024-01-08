package com.cos.blog.config.auth;

import com.cos.blog.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetail implements UserDetails {

    private User user;

    public PrincipalDetail(User user) {
        this.user = user;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    // 계정이 만료되지 않았는지를 확인(true = 만료 안됨)
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 계정이 잠겨있지 않은지를 확인(true = 잠기지 않음)
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    // 비밀번호가 만료되지 않았는지를 확인(true = 만료 안됨)
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    // 계정 활성화(사용 가능)가 되어있는지를 확인(true = 활성화)
    @Override
    public boolean isEnabled() {
        return true;
    }
    // 계정이 갖고 있는 권한 목록을 확인
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> collectors =  new ArrayList<>();
        collectors.add(() -> {
            return "ROLE_" + user.getRole();  //ROLE_USER
        });

        return collectors;
    }
}
