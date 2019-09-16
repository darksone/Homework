package com.company.homework2;

public class MathOperations {
    public static void main(String[] args) {

        int x, y;
        x = subtract(9, 8);
        System.out.println(x);
        x = multiply(9, 8);
        System.out.println(x);
        x = divide(9, 8);
        System.out.println(x);
    }

    private static int subtract(int i, int m) {
        return i - m;
    }

    private static int multiply(int k, int n) {
        return k * n;
    }

    private static int divide(int j, int d) {
        return j / d;
    }
}
