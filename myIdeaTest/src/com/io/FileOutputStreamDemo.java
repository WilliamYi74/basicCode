package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("aaa.txt", true);
        Scanner sc = new Scanner(System.in);
        int lineCount = 0;
        while (lineCount++ < 3) {
            System.out.println("请输入第" + lineCount + "行:");
            String s = sc.nextLine();
            fos.write(s.concat("\r").getBytes());
        }
        fos.close();
        System.out.println("输入完毕, 文件的内容是:");
        FileInputStream fis = new FileInputStream("aaa.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }
    }
}
