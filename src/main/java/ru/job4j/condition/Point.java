package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int rsltx = x2 - x1;
        int rslty = y2 - y1;
        double rslt2x = Math.pow(rsltx, 2);
        double rslt2y = Math.pow(rslty, 2);
        double rslt = Math.sqrt(rslt2x + rslt2y);
        return rslt;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
     double leght = distance(x1, y1, x2, y2);
     System.out.println("Длина отрезка с координатами (" + x1 + "," + y1 + ") и (" + x2 + "," + y2 + ") равна " + leght);
    }
}
