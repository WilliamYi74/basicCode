package com.yunwuyun.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("E:\\aaa");
        System.out.println(file.exists());
    }
}
