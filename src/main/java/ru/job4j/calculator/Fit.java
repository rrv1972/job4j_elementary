package ru.job4j.calculator;

public class Fit {

    public static double weightMan(double height) {
      double  rsl = (height - 100) * 1.15;
        return rsl;

    }

    public static double weightWoman(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

public static void main(String[] args) {
    double height = 187;
    double weightman = weightMan(height);
    double weightwomen = weightWoman(height);
    System.out.println("При росте 187 cm вес мужчины должен быть " + weightman);
    System.out.println("При росте 187 cm вес женщины должен быть " + weightwomen);
}
}
