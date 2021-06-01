package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double rsl1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl1);

        double rsl2 = TrgArea.area(6, 6, 6);
        System.out.println("area (6, 6, 6) = " + rsl2);
    }
}
