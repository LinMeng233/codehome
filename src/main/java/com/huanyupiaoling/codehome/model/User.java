package com.huanyupiaoling.codehome.model;

import com.huanyupiaoling.codehome.model.vo.FrontResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class User  {
    public long id=1;
    private String email;
    private String password;
    private String username;
    private String role;
    private int status;
    private Date regTime;
    private String regIp;
    private String data;
    @Resource
    private FrontResponse frontResponse;
    @Resource
    private UserSon userSon;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        System.out.println(username);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public UserSon getUserSon() {
        return userSon;
    }
    public void setUserSon(UserSon userSon) {
        this.userSon = userSon;
    }
}
