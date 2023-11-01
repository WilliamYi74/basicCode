package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "aaa.txt";
        File file = new File(path);
        if(file.createNewFile()){
            System.out.println("文件创建成功");
        }
    }
}
