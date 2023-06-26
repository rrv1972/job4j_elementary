package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test

    public void whenConvert140RblThen2Euro() {
        double in = 140;
        double expected = 2;
        double euro = Converter.rubtoEuro(in);
        double eps = 0.0001f;
        Assert.assertEquals(expected, euro, eps);
    }

    @Test

    public void whenConvert200RblThen2dot3333Euro() {
        double in = 200;
        double expected = 2.8571;
        double euro = Converter.rubtoEuro(in);
        double eps = 0.0001f;
        Assert.assertEquals(expected, euro, eps);
    }

    @Test
    public  void whenConvert140rblThen2dot3333Dollar() {
        double in = 140;
        double expected = 2.3333;
        double euro = Converter.rubtoDollar(in);
        double eps = 0.0001f;
        Assert.assertEquals(expected, euro, eps);
    }

    @Test
    public void whenConvert200rblThen3dot3333Dollar() {
        double in = 200;
        double expected = 3.3333;
        double euro = Converter.rubtoDollar(in);
        double eps = 0.0001f;
        Assert.assertEquals(expected, euro, eps);
    }

    }