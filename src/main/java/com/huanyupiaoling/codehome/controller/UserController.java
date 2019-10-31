package com.huanyupiaoling.codehome.controller;

import com.huanyupiaoling.codehome.model.User;
import com.huanyupiaoling.codehome.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(@RequestBody User user){
        return userService.selecttUser(user);
    }

    @ResponseBody
    @RequestMapping("/hello")
    public User getHello(){
        User user=new User();
        user.setUsername("你好");
        return user;
    }

    @ResponseBody
    @RequestMapping("/test")
    public User test(@RequestBody User user){
        user.setUsername("草你吗");
        return user;
    }
}
