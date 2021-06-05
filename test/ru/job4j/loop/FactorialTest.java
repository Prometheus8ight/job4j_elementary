package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int realResult = Factorial.calc(5);
        Assert.assertEquals(expected, realResult);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int realResult = Factorial.calc(0);
        Assert.assertEquals(expected, realResult);
    }
}