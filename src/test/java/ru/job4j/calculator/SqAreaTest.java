package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squAreWhen26then2() {
        int k1 = 2;
        int p1 = 6;
        double expected = 2;
        double out = SqArea.squAre(k1, p1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squAreWhen46then144() {
        int k1 = 4;
        int p1 = 6;
        double expected = 1.44;
        double out = SqArea.squAre(k1, p1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squAreWhen68then8() {
        int k1 = 6;
        int p1 = 8;
        double expected = 1.96;
        double out = SqArea.squAre(k1, p1);
        Assert.assertEquals(expected, out, 0.01);
    }
}