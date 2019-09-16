package com.company.homework5;

import java.util.Arrays;

public class FestoonV2 {
    public static void main(String[] args) {
        blinkLineFewTimes();
        runLine();
        turnOn();
        showCondition();
    }

    private static void blinkLineFewTimes() {
        int[][] values = {
                {1, 0, 0, 1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 0, 1}};
        for (int a = 0; a < 4; a++) {
            System.out.println(Arrays.deepToString(values));
        }

    }

    private static void runLine() {
        int[] values = {0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1};
        for (int d = 0, b = 1, c = 10; d < 10 && b < 11 && c > 0; d++, b++, c--) {
            System.arraycopy(values, d, values, b, c);
            System.out.println(Arrays.toString(values));
        }

    }

    private static void turnOn() {
        int[] values = {1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1};
        if (values[0] == 1) {
            System.out.println("Лампочка на первой позиции включена");
        } else {
            System.out.println("Лампочка на первой позиции выключена");
        }
    }

    private static void showCondition() {
        int[] values = {1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1};
        System.out.println(Arrays.toString(values));
    }
}
