package com.yunwuyun.constructor;

public class Constructor {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Constructor() {
    }

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
