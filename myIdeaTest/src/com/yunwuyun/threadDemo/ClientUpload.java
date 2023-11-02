package com.yunwuyun.threadDemo;

import java.io.*;
import java.net.Socket;

public class ClientUpload {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 9090);
        BufferedOutputStream bw = new BufferedOutputStream(s.getOutputStream());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("dir\\微信图片_20231021144411.jpg"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys, 0, bys.length)) != -1) {
            bw.write(bys, 0, len);
        }
        bw.close();
        bis.close();
        s.close();
    }
}
