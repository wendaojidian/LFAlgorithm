package com.lf.algorithm.search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int num) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (num > arr[mid]) low = mid + 1;
            else if (num < arr[mid]) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,8,10};
        for (int i = 0; i <= 11; i++) {
            System.out.println(i + ": " + binarySearch(arr, i));
        }
    }
}
