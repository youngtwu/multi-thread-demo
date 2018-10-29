package com.github.youngtwu.multithreadingdemo.multithread;

import com.github.youngtwu.multithreadingdemo.entity.User;

/**
 * @Auther: ASUS
 * @Date: 2018/10/29 19:02
 * @Description: 测试多线程之间的通信
 */
public class ThreadTest {

    public static void main(String[] args) {
        User user = new User();
        InputThread inputThread = new InputThread(user);
        OutPutThread outPutThread = new OutPutThread(user);

        inputThread.start();
        outPutThread.start();
    }
}
