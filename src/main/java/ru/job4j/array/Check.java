package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            boolean arm = data[0];
            if (arm != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
