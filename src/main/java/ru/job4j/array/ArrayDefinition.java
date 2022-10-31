package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Korobeinikov Stas";
        names[1] = "Mikhail Lukonin";
        names[2] = "Петр Арсентьев";
        names[3] = "Kartashova Elena";
        System.out.println("Размер массива равен: " + age.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println("Ответственный ментор: " + names[0]);
        System.out.println("Ответственный ментор: " + names[1]);
        System.out.println("Ответственный ментор: " + names[2]);
        System.out.println("Ответственный ментор: " + names[3]);
    }
}
