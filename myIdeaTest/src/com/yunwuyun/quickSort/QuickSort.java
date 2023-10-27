package com.yunwuyun.quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 4, 1, 5, 7, 3, 6};
        // 开始时的左右指针值
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        // 左边界>右边界时排序完成 不再继续
        if (left > right) {
            return;
        }
        // 记录开始时的左右索引 用于基准值归位
        int initLeft = left;
        int initRight = right;
        int baseNumber = arr[initLeft]; // 记录基准值
        while (left != right) {
            // 从右开始找比基准数小的 找到则循环停止 开始从左找比基准数大的
            while (arr[right] >= baseNumber && left < right) {
                right--;
            }
            while (arr[left] <= baseNumber && left < right) {
                left++;
            }
            // 左右指针都找到了比基准数小/大的数后 左右指针的数交换位置 如此反复直到左右指针相撞 基准数归位 将相撞时的位置和基准数的位置互换
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        // 基准数归位
        int tmp = arr[initLeft];
        arr[initLeft] = arr[left];
        arr[left] = tmp;
        // 下一次基准数归位范围缩小一半 因为基准数归位后基准数左边的都比它小 右边的都比基准数大 左右分别按照以上过程继续查找 每次边界都会缩小 直到左边界大于右边界时 排序完成
        quickSort(arr, initLeft, left - 1);
        quickSort(arr, left + 1, initRight);
    }
}
