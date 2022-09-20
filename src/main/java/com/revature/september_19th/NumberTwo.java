package com.revature.september_19th;

import java.util.Scanner;

public class NumberTwo {
    //Problem statement
    //  Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.
    //
    //Input
    //  The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
    //  Each test case is described with a single line containing a string S, the alphanumeric string.
    //
    //Output
    //  For each test case, output a single line containing the sum of all the digit characters in that string.
    //
    //Constraints
    //  1 ≤ T ≤ 1000
    //  1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
    //
    //Example Input:
    //  1
    //  ab1231da
    //Output:
    //  7
    //
    //Explanation
    //  The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            String alphanumeric = scan.next();
            digitSum(alphanumeric);
        }


    }

    public static void digitSum(String alphanumeric) {
        int sum = 0;
        for (char chr: alphanumeric.toCharArray()) {
            try {
                sum += Integer.parseInt(String.valueOf(chr));
            } catch (Exception ignored) {}
        }
        System.out.println(sum);
    }
}
