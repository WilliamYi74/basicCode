package com.threadDemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() {
        for (int i = 0; i < 100; i++) {
            System.out.println("callable-" + Thread.currentThread().getName() + "创建线程" + i);
        }
        return "嘿嘿callable创建线程";
    }
}
