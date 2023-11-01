package com.yunwuyun.extendsTest;

public class Parent {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Parent() {
        System.out.println("父类无参构造函数执行了");
    }

    public Parent(int age) {
        this.age = age;
        System.out.println("父类有参构造函数执行了");
    }

}
