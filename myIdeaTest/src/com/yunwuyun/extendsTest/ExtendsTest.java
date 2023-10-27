package com.yunwuyun.extendsTest;

public class ExtendsTest {
    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child(18);
        System.out.println(child.getAge());
        child.setAge(19);
        System.out.println(child.getAge());
        System.out.println(child2.getAge());
    }
}
