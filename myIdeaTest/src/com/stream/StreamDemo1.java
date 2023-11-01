package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    private static void demo2() {
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i + 1));
        }
        Set<Integer> integers = hm.keySet().stream().filter(item -> item > 5).collect(Collectors.toSet());
        System.out.println("keySet遍历方式---------------");
        for (Integer i : integers) {
            System.out.println(i + "->" + hm.get(i));
        }
        System.out.println("entrySet遍历方式---------------");
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("key->" + entry.getKey() + ",value->" + entry.getValue());
        }
        List<Integer> integerList = hm.values().stream().map(item -> Integer.valueOf(item) + 1).collect(Collectors.toList());
        for (Integer i : integerList) {
            System.out.println("v->" + i);
        }
    }

    private static void demo1() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        List<Integer> integerList = integers.stream().filter(item -> item > 5).map(item -> item + 1).collect(Collectors.toList());
        for (Integer i : integerList) {
            System.out.println("i->" + i);
        }
    }
}
