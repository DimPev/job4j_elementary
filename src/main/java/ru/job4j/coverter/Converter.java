package ru.job4j.coverter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float usd = Converter.rubleToDollar(140);
        float in = 140;
        float expectedEuro = 2;
        float expectedUsd = 2.3333333F;
        float outEuro = Converter.rubleToEuro(in);
        float outUsd  = Converter.rubleToDollar(in);
        boolean passedEuro = outEuro == expectedEuro;
        boolean passedUsd = outUsd == expectedUsd;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + usd + " usd.");
        System.out.println(passedEuro);
        System.out.println(passedUsd);
    }
}
