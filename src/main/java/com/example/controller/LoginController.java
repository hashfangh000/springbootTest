package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session){
        if(userService.loginCheck(username,password) == true){
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            //告诉用户，登录失败
            model.addAttribute("msg","用户名或密码错误！");
            return "index";
        }
    }
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }

    @GetMapping("/user")
    public String toRegisterpage(){
        return "user/register";
    }
    @PostMapping("/user")
    public String register(String username,String password, Model model){
        boolean num = userService.registerCheck(username);
        if(num){
            userService.registerUser(username,password);
            model.addAttribute("register","注册成功");
            return "redirect:/index.html";
        }else{
            model.addAttribute("register","用户名已存在！");
            return "redirect:/user";
        }
    }
}
