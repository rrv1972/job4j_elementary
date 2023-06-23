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

        float euro = rubtoEuro(140); /*вызов подпрог с возвратом значения перевода руб в евро */
        float dollar = rubtoDollar(160); /*вызов подпрограмы с возвратом значения перевода руб в доллар*/
        System.out.println("140 rub = " + euro + " euro");
        System.out.println("160 rub = " + dollar + " dollar");
    }
}
