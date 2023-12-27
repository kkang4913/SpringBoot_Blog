package com.cos.blog.controllerTest;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;
import java.util.function.Supplier;

@Slf4j
@RestController
public class DummyControllerTest {



    @Autowired
    private UserRepository userRepository;

    /**
     * http://localhost:8080/blog/dummy/join
     * @param username 유저네임
     * @param password 패스워드
     * @param email    이메일
     * @return  회원가입 완료
     */
    @PostMapping("/dummy/join")
    public String join(String username, String password, String email){
        System.out.println("DummyControllerTest.join 실행");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("email = " + email);
        return "회원가입이 완료되었습니다.";
    }
    @PostMapping("/dummy/join2")
    public String join(User user){
        System.out.println("DummyControllerTest.join 실행2");
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
        System.out.println(user.getRole());
        System.out.println(user.getCreateDate());
        return "회원가입이 완료되었습니다.";
    }

    @PostMapping("/dummy/join/repo")
    public String joinRepo(User user){
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());


        User userinfo = User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .email(user.getEmail())
                        .createDate(currentTimestamp)
                    .build();

            //userinfo.setRole(RoleType.USER);

        System.out.println(userinfo.getId());
        System.out.println(userinfo.getUsername());
        System.out.println(userinfo.getPassword());
        System.out.println(userinfo.getEmail());
        System.out.println(userinfo.getRole());
        System.out.println(userinfo.getCreateDate());

        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }
    /**
     *  { } = 주소로 파라미터를 전달 받을 수 있음
     */
    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id){
        User user = userRepository.findById(id).orElseGet(new Supplier<User>() {
            public User get(){
                return new User();
            }
        });
        return user;
    }
    @GetMapping("/dummy/user/error/{id}")
    public User detail2(@PathVariable int id) {

        User user = userRepository.findById(id).orElseThrow(()-> {
            return new IllegalArgumentException("해당되는 유저가 없습니다. id= " + id);
        });
        return user;
    }

    /**
     * 모든 데이터 출력
     * @return = 모든 데이터
     */
    @GetMapping("/dummy/user")
    public List<User> list(){
        return userRepository.findAll();
    }

    @GetMapping("/dummy/user/page/{page}")
    public List<User> PageList(@PathVariable int page){
        int size = 2;
        int start = page * size;
        int end =(page + 1) * size;

        List<User> users = userRepository.selectUserPage(start,end);

        log.info("start={}", start);
        log.info("end={}", end);

        return users;
    }



}
