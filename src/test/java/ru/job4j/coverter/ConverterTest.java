package ru.job4j.coverter;


import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot33Dlr() {
        float in = 200;
        float expected = 3.33F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}