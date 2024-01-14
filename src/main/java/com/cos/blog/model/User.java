package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor //Lombok 에서 제공하는 어노테이션으로, 모든 필드를 파라미터로 받는 생성자를 자동 생성
@NoArgsConstructor  //Lombok 에서 제공하는 어노테이션으로, 파라미터가 없는 기본 생성자를 자동으로 생성
@Builder            //빌더 패턴을 구현, 객체를 생성할 때 객체의 속성을 명시적으로 지정하여 객체를 생성하거나 초기화하는 방법을 제공
public class User {

    private int id;                 //유저 아이디 , DBTable : USER_SEQ 사용  (NEXT.VAL)
    private String username;        //유저 이름
    private String password;        //유저 패스워드
    private String email;           //유저 이메일


    private RoleType role;
    private Timestamp createDate;   //생성 날짜
}
