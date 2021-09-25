package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    String loginCheck(String username,String password);
    void registerUser(String username,String password);
    String registerCheck(String username);
}
