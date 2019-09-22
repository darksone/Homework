package com.company.homework7;

public class Recursion {
    public static void main(String[] args) {
        values(214, 123);

    }

    static int values(int a, int b) {
        int result;
        System.out.println(a + " ");

        if (a == b) {
            return 0;
        }
        if (a < b) {
            result = values(a + 1, b);
            return result;
        }
        if (a > b) {
            result = values(a-1,b);
            return result;

        }
        return 1;

    }

}

