package com.revature.september_19th;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOne {
    //Problem Statement
    //  Write a program that accepts sets of three numbers and prints the second-maximum number among the three.
    //
    //Input
    //  First line contains the number of triples, N.
    //  The next N lines which follow each have three space separated integers.
    //
    //Output
    //  For each of the N triples, output one new line which contains the second-maximum integer among the three.
    //
    //Constraints
    //  1 ≤ N ≤ 6
    //  1 ≤ every integer ≤ 10000
    //  The three integers in a single triplet are all distinct. That is, no two of them are equal.
    //
    //Sample Input
    //  3
    //  1 2 3
    //  10 15 5
    //  100 999 500
    //  Sample Output
    //  2
    //  10
    //  500
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
            arr[i][2] = scan.nextInt();
        }
        secondMax(arr, N);
    }
    public static void secondMax(int[][] arr, int N) {
        for(int i = 0; i < N; i++) {
            Arrays.sort(arr[i]);
            System.out.println(arr[i][1]);
        }

    }

}
