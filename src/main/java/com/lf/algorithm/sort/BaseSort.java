package com.lf.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * @author liufan
 * @description: 通用排序类
 * @since 2025/06/30
 */
public class BaseSort {
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void print(Comparable[] a) {
        System.out.println(Arrays.asList(a));
    }

    public static boolean isSorted(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (less(arr[i + 1], arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void testSort(int N, String method) {
        Double arr[] = new Double[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextDouble();
        }
        switch (method) {
            case "selection":
                SelectionSort.sort(arr);
                break;
            case "insert":
                InsertSort.sort(arr);
                break;
            case "shell":
                ShellSort.sort(arr);
        }
        print(arr);
        System.out.println(isSorted(arr));
    }

    public static Double[] RandomArr(int N) {
        Double[] arr = new Double[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }

    public static long timeSort(int N, String method) {
        Double arr[] = new Double[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextDouble();
        }
        long startTime = System.currentTimeMillis();
        if ("selection".equals(method)) {
            SelectionSort.sort(arr);
        } else if ("insert".equals(method)) {
            InsertSort.sort(arr);
        } else if ("shell".equals(method)) {
            ShellSort.sort(arr);
        }
        return System.currentTimeMillis() - startTime;

    }

    public static void main(String[] args) {
//        testSort(10, "selection");
//        testSort(10, "insert");
        System.out.println(timeSort(100000, "selection"));
        System.out.println(timeSort(100000, "insert"));
    }


}
