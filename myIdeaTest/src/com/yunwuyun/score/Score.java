package com.yunwuyun.score;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数");
            int num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("分数只能是0-100,请重新输入分数");
                i--;
            } else {
                score[i] = num;
            }
        }
        int max = score[0];
        for (int idx = 0; idx < score.length; idx++) {
            if (max < score[idx]) {
                max = score[idx];
            }
        }
        int min = score[0];
        for (int idx = 0; idx < score.length; idx++) {
            if (min > score[idx]) {
                min = score[idx];
            }
        }
        int sum = 0;
        for (int idx = 0; idx < score.length; idx++) {
            sum += score[idx];
        }
        int avg = (sum - max - min) / 3;
        System.out.println("平均分为" + avg);
    }
}
