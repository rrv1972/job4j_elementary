package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class FitTest {

    @Test

    public void whenman187then100() {
        double hight = 187;
        double expected = 100.05;
        double out = Fit.weightMan(hight);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test

    public void whenman190then103() {
        double hight = 190;
        double expected = 103.5;
        double out = Fit.weightMan(hight);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

    public void whenwoman187Then88() {
        double hight = 187;
        double expected = 88.55;
        double out = Fit.weightWoman(hight);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

    public void whenwoman167Then65() {
        double hight = 167;
        double expected = 65.55;
        double out = Fit.weightWoman(hight);
        Assert.assertEquals(expected, out, 0.01);
    }


}