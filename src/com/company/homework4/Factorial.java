package com.company.homework4;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; ++i) {
            f *= i;
        }
        return f;
    }
}
