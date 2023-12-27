package com.cos.blog.controllerTest;

import com.cos.blog.testDto.Member;
import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {
    /**
     * 요청: http://localhost:8080/http/get
     * @return "GET 요청 + id값"
     */
    @GetMapping("/http/get")
    public String getTest(@RequestParam int id, @RequestParam String username){
        return "GET 요청" + id + "," + username;
    }
    @GetMapping("/http/get/member")
    public String getTest(Member m){
        return "객체 GET 요청" + "=" + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }

    /**
     * 요청: http://localhost:8080/http/post
     * @return
     */
    @PostMapping("/http/post")
    public String postTest(){
        return "POST 요청";
    }
    @PostMapping("/http/post/member")
    public String postTest(Member m){
        return "객체 POST 요청" + "=" + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }

    @PostMapping("http/post/raw")
    public String PostTest(@RequestBody String text){
        return "POST 요청 + raw 형태 : " + text;
    }
    @PostMapping("http/post/json")
    public String PostTest(@RequestBody Member m){
        return "POST 요청 + JSON 형태 : " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }


    /**
     * 요청: http://localhost:8080/http/put
     * @return
     */
    @PutMapping ("/http/put")
    public String putTest(){
        return "PUT 요청";
    }
    /**
     * 요청: http://localhost:8080/http/delete
     * @return
     */
    @DeleteMapping ("/http/delete")
    public String deleteTest(){
        return "DELETE 요청";
    }



}
