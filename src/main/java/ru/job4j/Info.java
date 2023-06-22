package ru.job4j;

/*public class Info {
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




public class Info {
    public static void hello(String name) {
                System.out.println("Hello, " + name);
    }

    public static void main(String[] args)  {
        String name = "Petr Arsentev";
        Info.hello(name);
    }

}/*

 */

/*public class Info {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        Info.hello(name, age);
        Info.hello(name, age);
        Info.hello(name, age);
        Info.hello(name, age);
    }
}/*

 */

public class Info {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = Info.func1(3);
        int result2 = Info.func2(5);
        int result3 = Info.func1(100);
        int total = result1 + result2;
        System.out.println(total);
        System.out.println(result3);
    }
}