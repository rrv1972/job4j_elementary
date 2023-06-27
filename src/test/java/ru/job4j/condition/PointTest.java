package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when2345Then283() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

    public void when6789Then283() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 8;
        int y2 = 9;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

    public void when1289Then99() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 8;
        int y2 = 9;
        double expected = 9.9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}