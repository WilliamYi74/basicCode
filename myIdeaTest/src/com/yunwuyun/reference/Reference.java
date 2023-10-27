package com.yunwuyun.reference;

public class Reference {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        increment(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void increment(int[] arr) {
        arr[1] = 22;
    }
}
