package ru.job4j.converter;

public class Converter {

    public static float rubtoEuro(float value) {
        float result = value / 90;
        return result;
    }

    public static float rubtoDollar(float value) {
        float result = value / 84;
        return result;
    }

    public static void main(String[] args) {

        float euro = Converter.rubtoEuro(140);
        float dollar = Converter.rubtoDollar(160);
        System.out.println("140 rub = " + euro + " euro");
        System.out.println("160 rub = " + dollar + " dollar");
    }
}
