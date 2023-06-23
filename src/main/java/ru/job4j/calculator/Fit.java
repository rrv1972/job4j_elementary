package ru.job4j.calculator;

public class Fit {

    public static double weithMen(double height) {
      double  rsl = (height - 100) * 1.15;
        return rsl;

    }

    public static double weithWomen(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

public static void main(String[] args) {
    double height = 187;
    double weithmen = weithMen(height);
    double weithwomen = weithWomen(height);
    System.out.println("При росте 187 cm вес мужчины должен быть " + weithmen);
    System.out.println("При росте 187 cm вес женщины должен быть " + weithwomen);
}
}
