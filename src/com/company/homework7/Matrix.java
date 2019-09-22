package com.company.homework7;


public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 5}, {1, 7}};
        int[][] matrix2 = new int[][]{{8, 4}, {3, 1}};
        sum(matrix1, matrix2);
        multiply(matrix1, 10);
        print(matrix2);

    }

    static int[][] sum(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[2][2];
        System.out.println("Sum =    ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        return sum;


    }

    static int[][] multiply(int[][] matrix1, int k) {
        int[][] multiply = new int[2][2];
        System.out.println("Multiply =   ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                multiply[i][j] = matrix1[i][j] * k;
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        return multiply;

    }

    static int[][] print(int[][] matrix1) {
        int[][] print = new int[2][2];
        System.out.println("Print on the screen:   ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                print[i][j] = matrix1[i][j];
                System.out.print(print[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return print;

    }
}
