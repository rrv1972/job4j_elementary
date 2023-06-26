package ru.job4j.converter;

public class Converter {

    public static double rubtoEuro(double value) {
        double result = value / 70;
        return result;
    }

    public static double rubtoDollar(double value) {
        double result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        double in = 140;
        double expectedeuro  = 2;
        double expecteddollar = 2.3333333;
        double euro = rubtoEuro(in); /*вызов подпрог с возвратом значения перевода руб в евро */
        boolean passedeuro = expectedeuro == euro;
        double dollar = rubtoDollar(in); /*вызов подпрограмы с возвратом значения перевода руб в доллар*/
        boolean passeddollar = dollar == expecteddollar;
        System.out.println(" 140 рублей равно 2 евро это " + passedeuro);
        System.out.println(" 140 рулей равно " + dollar + " доллара это " + passeddollar);

        System.out.println("140 rub = " + euro + " euro");
        System.out.println("140 rub = " + dollar + " dollar");
    }
}
