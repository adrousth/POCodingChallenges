package com.revature.october_6th;

public class NumberTwo {
    // (ii) Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.
    public static void main(String[] args) {
        isFactorial(2);
        isFactorial(27);
        isFactorial(24);
    }

    public static void isFactorial(int x) {
        int i = 1;
        int factorial = 1;
        while(x > factorial) {
            i++;
            factorial *= i;
        }
        System.out.println(factorial == x);
    }
}
