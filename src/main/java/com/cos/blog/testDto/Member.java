package com.cos.blog.testDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private int id;
    private String username;
    private int password;
    private String email;
//
//    /**
//     * 자동 생성자 단추키(ctrl + insert)
//     * @param id
//     * @param username
//     * @param password
//     * @param email
//     */
//    public Member(int id, String username, int password, String email) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//    }
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getUsername() {
//        return username;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public int getPassword() {
//        return password;
//    }
//    public void setPassword(int password) {
//        this.password = password;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
