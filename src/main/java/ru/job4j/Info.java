package ru.job4j;
public class Info {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Info.plus(100, 500);
        Info.plus(4, 2);
        Info.plus(3, 5);
    }
}

