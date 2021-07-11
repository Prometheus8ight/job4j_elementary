package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int max = max(a, b);
        return max > c ? max : c;
    }

    public static int max(int a, int b, int c, int d) {
        int max = max(a, b, c);
        return max > d ? max : d;
    }
}
