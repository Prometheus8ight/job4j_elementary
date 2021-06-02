package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollars = Converter.rubleToDollar(280);
        System.out.println("280 rubles are " + dollars + " dollars.");

        int inRub1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(inRub1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        int inRub2 = 280;
        int expected2 = 4;
        int out2 = Converter.rubleToDollar(inRub2);
        boolean passed2 = expected2 == out2;
        System.out.println("280 rubles are 4. Test result : " + passed2);
    }
}

