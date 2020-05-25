package com.huanyupiaoling.codehome.service.impl;

import com.huanyupiaoling.codehome.dao.UserDao;
import com.huanyupiaoling.codehome.model.User;
import com.huanyupiaoling.codehome.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User selecttUser(User user){
        return userDao.selectUser(user.getId());
    }

    @Override
    public User selectUser(long id){
        return userDao.selectUser(id);
    }
    @Override
    public void addUser(User user){
        userDao.insertUser(user);
    };
}
