package com.lf.algorithm.sort;

/**
 * @author liufan
 * @description: TODO
 * @since 2025/06/30
 */
public class SelectionSort {
    public static void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (BaseSort.less(arr[j], arr[min])) {
                    min = j;
                }
            }
            if (i != min) {
                BaseSort.exch(arr, i, min);
            }
        }
    }

    public static void main(String[] args) {

    }
}
