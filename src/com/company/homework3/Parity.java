package com.company.homework3;

public class Parity {

    public static void main(String[] args) {

        String s = "147";
        int a = Integer.parseInt(s);
        double b = a % 2;
        if (b != 0) {
            System.out.println("Число нечетное.");
        }


    }
}
