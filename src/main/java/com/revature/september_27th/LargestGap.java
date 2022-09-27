package com.revature.september_27th;

import java.util.Arrays;
import java.util.Scanner;

public class LargestGap {
    // Given an array of integers, return the largest gap between the sorted elements of the array.
    public static void main(String[] args) {

        findLargestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5});
        findLargestGap(new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7});
        findLargestGap(new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9});
    }

    public static void findLargestGap(int[] arr) {
        Arrays.sort(arr);
        int largestGap = 0;
        int gap;
        for(int i = 0; i < arr.length - 1; i++) {
            gap = Math.abs(arr[i] - arr[i+1]);
            if(gap > largestGap) {
                largestGap = gap;
            }
        }
        System.out.println(largestGap);
    }
}
