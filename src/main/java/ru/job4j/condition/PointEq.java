package ru.job4j.condition;

public class PointEq {

    public static boolean eq(int x1, int y1, int x2, int y2) {
        return y1 == y2 && x1 == x2;
    }

    public static void main(String[] args) {
       boolean rls = eq(1, 1, 2, 2);
        System.out.println(rls);
        rls = eq(10, 10, 10, 10);
        System.out.println(rls);
    }
}

