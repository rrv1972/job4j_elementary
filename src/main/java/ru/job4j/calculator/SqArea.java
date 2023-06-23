package ru.job4j.calculator;

public class SqArea {

    public static double squAre(int k, int p) {
        double rsl = k * Math.pow(p, 2) / (4 * Math.pow((k + 1), 2));
        return rsl;
    }

    public static void main(String[] args) {
         int k = 2;
         int p = 6;
         double s = squAre(k, p);
         System.out.println("Площадь прямоугольника равна " + s);

    }
}
