package com.lf.algorithm.sort;

/**
 * @author liufan
 * @description: TODO
 * @since 2025/06/30
 */
public class InsertSort {
    public static void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i ++) {
            for (int j = i; j > 0 && BaseSort.less(arr[j], arr[j - 1]); j--) {
                BaseSort.exch(arr, j, j - 1);
            }
        }
    }
}
