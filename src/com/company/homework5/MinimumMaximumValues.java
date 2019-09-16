package com.company.homework5;

public class MinimumMaximumValues {
    public static void main(String[] args) {
        int[][] values = new int[5][8];
        int i, j, k = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                values[i][j] = k++;
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        int[][] minmax = new int[5][2];
        int a, b = 0;
        for (a = i = 0; i < 5; i++) {
            for (b = j = 0; b < 2; j = j + 7, b++) {
                minmax[a][b] = values[i][j];
                System.out.print(minmax[a][b] + " ");
            }
            System.out.println();
        }
    }
}
