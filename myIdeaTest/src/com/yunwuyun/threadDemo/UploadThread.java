package com.yunwuyun.threadDemo;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class UploadThread implements Runnable {
    private Socket socket;

    public UploadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(this.socket.getInputStream());
            bos =
                    new BufferedOutputStream(new FileOutputStream("dir\\" + UUID.randomUUID() + ".jpg"));
            byte[] bys = new byte[1024];
            int len;
            while ((len = bis.read(bys, 0, bys.length)) != -1) {
                bos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
