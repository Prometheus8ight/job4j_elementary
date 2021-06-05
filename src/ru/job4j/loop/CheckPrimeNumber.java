package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int m = number / 2;
        if (number == 0 || number == 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

