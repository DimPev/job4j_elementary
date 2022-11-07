package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] test = new int[size][size];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = (i + 1) * (j + 1);
                System.out.println(test[i][j]);
            }
        }
        return test;
    }
}
