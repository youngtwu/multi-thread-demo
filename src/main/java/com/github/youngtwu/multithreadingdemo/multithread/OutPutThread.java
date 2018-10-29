package com.github.youngtwu.multithreadingdemo.multithread;

import com.github.youngtwu.multithreadingdemo.entity.User;

/**
 * @Auther: ASUS
 * @Date: 2018/10/29 19:00
 * @Description: 输出线程资源
 */
public class OutPutThread extends Thread {

    private User user;

    public OutPutThread(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (user){
                System.out.println(user.toString());
            }
        }
    }
}
