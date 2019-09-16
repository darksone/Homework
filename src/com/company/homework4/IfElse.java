package com.company.homework4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        outPositiveNumber();
    }

    private static void outPositiveNumber() {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a >= 0 && a <= 10) {
                System.out.println("Положительное число меньше 10.");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");

            }
        }
    }
}
