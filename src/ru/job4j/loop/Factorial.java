package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int num = 1;
        if (n == 0) {
            return num;
        } else if (n == 1) {
            return num;
        } else {
            for (int i = 2; i <= n; i++) {
                num *= i;
            }
        }
        return num;
    }
}
