package ru.job4j.condition;

public class TrgArea {

    public  static double trgArea(double p, int a, int b, int c) {
     double rst = Math.sqrt(p * (p - a) * (p - b) * (p - c));
     return rst;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        double p = (a + b + c) / 2;
        double trgS = trgArea(p, a, b, c);
        System.out.println("Площадь треугольника со сторонами a=" + a + " ,b=" + b + " ,с=" + c + " Ровна = " + trgS);
    }
}
