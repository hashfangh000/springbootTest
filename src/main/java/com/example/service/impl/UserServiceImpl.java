package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean loginCheck(String username,String password) {
          if(userMapper.loginCheck(username,password) != null){
              return true;
          }else {
              return false;
          }
    }
    @Override
    public void registerUser(String username, String password) {
        userMapper.registerUser(username,password);
    }
    @Override
    public boolean registerCheck(String username){
        if(userMapper.registerCheck(username) == null){
            return true;
        }else {
            return false;
        }
    }
}
