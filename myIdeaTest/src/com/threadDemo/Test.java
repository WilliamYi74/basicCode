package com.threadDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        m1();
//        m2();
//        m3();
    }

    private static void m3() {
        MyThread mt1 = new MyThread("MyThead1");
        MyThread mt2 = new MyThread("MyThead2");
        mt1.start();
        mt2.start();
    }

    private static void m2() throws InterruptedException, ExecutionException {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t = new Thread(ft);
        t.start();
        String result = ft.get();
        System.out.println("线程执行返回结果为:" + result);
    }

    private static void m1() {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();
    }
}
