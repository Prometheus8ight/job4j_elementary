package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int num = 1;
            for (int i = 1; i <= n; i++) {
                num *= i;
            }
        return num;
    }
}
