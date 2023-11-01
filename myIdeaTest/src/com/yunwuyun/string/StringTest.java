package com.yunwuyun.string;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        demo3();
    }

    private static void demo3() throws IOException {
        System.out.println("请输入要脱敏的手机号:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phone = br.readLine().trim();
        if (phone.length() != 11) {
            System.out.println("手机号必须是11位");
            return;
        }
        String replacedStr = phone.replace(phone.substring(3, 7), "****");
        System.out.println("脱敏后的手机号: " + replacedStr);
    }

    private static void demo2() {
        String a = "abc";
        String b = "ab" + "c";
        System.out.println(a == b); // true 对于编译器已知的字符串jvm编译会在编译时对b进行常量折叠合并成一个字符串放入常量池中 这是jvm在编译期做的一个优化 为了避免创建冗余的字符串对象 所以a和b引用的是常量池中同一个引用
    }

    private static void demo1() {
        String a = "abc";
        String b = "ab";
        String c = b + "c";
        System.out.println(a == c); // false +号会使用StringBuilder进行拼接再toString生成一个新的String对象 所以地址不一样
    }
}

