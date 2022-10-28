package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return num % 2 != 0;
    }

    public static boolean notPositive(int num) {
        return  num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return num % 2 != 0 && num > 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return num % 2 == 0 || num < 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isPositive(7));
        System.out.println(notEven(7));
        System.out.println(notPositive(7));
        System.out.println(notEvenAndPositive(7));
        System.out.println(evenOrNotPositive(7));
    }
}

