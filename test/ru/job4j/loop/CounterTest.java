package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToFiftyThenSixHundredFortyFour() {
        int start = 5;
        int finish = 50;
        int result = Counter.sumByEven(start, finish);
        int expected = 644;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromEightToThirtySixThenThreeHundredThirty() {
        int start = 8;
        int finish = 36;
        int result = Counter.sumByEven(start, finish);
        int expected = 330;
        Assert.assertEquals(expected, result);
    }
}