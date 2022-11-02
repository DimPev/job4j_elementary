package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 1; index < bound; index++) {
            rst[index] = index * index;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int arrs : array) {
            System.out.println(arrs);
        }
    }
}
