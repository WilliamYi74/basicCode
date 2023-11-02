package com.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String hostAddress = inetAddress.getHostAddress();
        String hostName = inetAddress.getHostName();
        System.out.println("主机名:" + hostName);
        System.out.println("主机地址:" + hostAddress);
    }
}
