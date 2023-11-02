package com.threadDemo;

public class TicketTest {
    public static void main(String[] args) {
        MyTicket mt = new MyTicket();
        Thread t1 = new Thread(mt, "线程1");
        Thread t2 = new Thread(mt, "线程2");
        t1.start();
        t2.start();
    }
}
