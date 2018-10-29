package com.github.youngtwu.multithreadingdemo.entity;

/**
 * @Auther: ASUS
 * @Date: 2018/10/29 18:52
 * @Description: 共享资源源实体类
 */
public class User {
    private String userName;
    private String userSex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
