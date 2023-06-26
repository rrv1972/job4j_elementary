package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDesDev(double first, double second) {
        return division(first, second) + substruction(first, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second) + substruction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат (сложения + умножения) будет равен " + sumAndMultiply(10, 20));
        System.out.println("Результат (вычитание + деление) будет равен " + sumDesDev(10, 20));
        System.out.println("Результат (слож+умнож+вычит+делен) будет равен " + allSum(10, 20));
    }

}