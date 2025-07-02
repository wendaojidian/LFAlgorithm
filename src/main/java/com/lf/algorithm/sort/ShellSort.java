package com.lf.algorithm.sort;

/**
 * @author liufan
 * @description: TODO
 * @since 2025/07/02
 */
public class ShellSort {
    public static void sort(Comparable[] arr) {
        int N = arr.length;
        int h = N / 2;
        while(h >= 1) {
            for (int i = h; i < N; i++) {
               for (int j = i; j >= h && BaseSort.less(arr[j], arr[j - h]); j -= h) {
                   BaseSort.exch(arr, j, j - h);
               }
            }
            h /= 2;
        }
    }

    public static void main(String[] args) {
        BaseSort.testSort(10, "shell");
    }
}
