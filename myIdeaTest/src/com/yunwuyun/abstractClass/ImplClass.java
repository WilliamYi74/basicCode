package com.yunwuyun.abstractClass;

import com.yunwuyun.abstractClass.AbstractClass;

public class ImplClass extends AbstractClass {
    @Override
    public void sayHi(String name) {
        System.out.println("我实现了sayHi方法:" + name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("哈哈哈把你重写惹");
    }
}
