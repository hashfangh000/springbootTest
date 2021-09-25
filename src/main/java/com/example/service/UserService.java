package com.example.service;

public interface UserService {
    boolean loginCheck(String username,String password);
    void registerUser(String username,String password);
    boolean registerCheck(String username);
}
