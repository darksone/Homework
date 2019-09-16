package com.company.homework2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        doScanner();
    }

    private static void doScanner() {
        int k = 0, m = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        k = getValue(scanner);

        m = getValue(scanner);
        int str = k + m;
        System.out.println("Сумма заданных чисел: " + str);
    }

    private static int getValue(Scanner scanner) {
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число!");
            System.exit(0);
            return -1;
        }
    }
}
