package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {

    void save(User user);

    Optional<User> findById(int id);

    List<User> findAll();

    List<User> selectUserPage(@Param("start") int start, @Param("end") int end);
}
