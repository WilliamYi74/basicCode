package com.yunwuyun.extendsTest;

public class Child extends Parent{
    public Child() {
        super();
        System.out.println("子类无参构造函数执行了");
    }

    public Child(int age) {
        super(age);
        System.out.println("子类有参构造函数执行了");
    }
}
