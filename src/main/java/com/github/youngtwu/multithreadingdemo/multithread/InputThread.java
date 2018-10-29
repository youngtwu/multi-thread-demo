package com.github.youngtwu.multithreadingdemo.multithread;

import com.github.youngtwu.multithreadingdemo.entity.User;

/**
 * @Auther: ASUS
 * @Date: 2018/10/29 18:53
 * @Description: 输入线程资源
 */
public class InputThread extends Thread {

    private User user;

    public InputThread(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (user){
                if (count == 0) {
                    user.setUserName("余胜军");
                    user.setUserSex("男");
                } else {
                    user.setUserName("小紅");
                    user.setUserSex("女");
                }
                count = (count + 1) % 2;
            }
        }
    }
}
