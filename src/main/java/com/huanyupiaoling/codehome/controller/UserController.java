package com.huanyupiaoling.codehome.controller;

import com.huanyupiaoling.codehome.model.User;
import com.huanyupiaoling.codehome.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {


    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(@RequestBody User user){
        logger.info("sb");
        return userService.selecttUser(user);
    }

    @ResponseBody
    @RequestMapping("/hello")
    public Object getHello(){
        User user=new User();
        user.setEmail("291157220");
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
