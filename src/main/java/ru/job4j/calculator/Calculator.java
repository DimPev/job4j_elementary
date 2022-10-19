package ru.job4j.calculator;


public class Calculator {

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo  = six / two;
        int fiveMinusTwo  = five - two;
        int fourTimeTwo   = four * two;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
        Calculator.plus(100,  500);
        Calculator.plus(4,  2);
        Calculator.plus(3,  5);


        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }

    public static void plus(int first, int second) {
    int result = first + second;
    System.out.println(result);
    }
    public class ArgMethod {

        public static void hello(String name, int age) {
            System.out.println("Hello, " + name + ", age = " + age);
        }
}
}