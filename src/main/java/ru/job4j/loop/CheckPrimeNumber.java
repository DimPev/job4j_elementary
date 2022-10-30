package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        int stop = 0;
        for (int index = 2; index <= number; index++) {
            if (number % index == 0) {
                stop += 1;
                prime = true;
            } else if (stop >= 1) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}


