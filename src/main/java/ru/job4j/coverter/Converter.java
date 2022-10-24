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
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println("140 rubles are " + euro + " euro." + passed);

        in = 6000;
        expected = 100;
        out = Converter.rubleToDollar(in);
        passed = out == expected;
        System.out.println("140 rubles are " + usd + " usd." + passed);

    }
}
