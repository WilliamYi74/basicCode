package com.yunwuyun.methodoverload;

public class MethodOverload {
    public static void main(String[] args) {
        eat("小易", 3);
        eat("小易", "七个烧烤");
    }

    public static void eat(String person, int num) {
        System.out.println(person + "请客" + num + "个人吃饭");
    }

    public static void eat(String person, String place) {
        System.out.println(person + "请客" + "在" + place + "吃饭");
    }
}
