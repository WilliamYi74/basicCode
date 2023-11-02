package com.threadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class MyTicket implements Runnable {
    private int tick = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 加锁每次只能一个线程执行同步代码块 锁对象要唯一 用this当前线程类实例对象
//            synchronized (this) {
            lock.lock();
            try {
                if (tick <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tick--;
                    System.out.println(Thread.currentThread().getName() + "在正在卖票还剩: " + tick + "张");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
//            }
        }
    }

}
