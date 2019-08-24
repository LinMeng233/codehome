package com.huanyupiaoling.codehome.dao;


import com.huanyupiaoling.codehome.model.User;

public interface UserDao {

    User selectUser(long id);

}