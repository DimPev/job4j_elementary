package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - i - 1; i++) {
            int first = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = first;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        back(arr);
        for (int arrr : arr) {
            System.out.println(arrr);
        }
    }
}
