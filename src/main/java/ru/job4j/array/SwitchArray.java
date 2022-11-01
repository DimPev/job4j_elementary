package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int tem = array[source];
        array[source] = array[dest];
        array[dest] = tem;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
        int[] switchSD = swap(nums, 5, 2);
        for (int index = 0; index < switchSD.length; index++) {
            System.out.println(switchSD[index]);
        }
    }
}
