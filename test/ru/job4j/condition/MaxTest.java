package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To100Then100() {
        int left = 10;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To50Then50() {
        int left = 50;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int a = 1;
        int b = 3;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To7To2Then20() {
        int a = 20;
        int b = 7;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To20To3To100Then100() {
        int a = 10;
        int b = 20;
        int c = 3;
        int d = 100;
        int result = Max.max(a, b, c, d);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To200To3To111Then200() {
        int a = 10;
        int b = 200;
        int c = 3;
        int d = 111;
        int result = Max.max(a, b, c, d);
        int expected = 200;
        Assert.assertEquals(result, expected);
    }
}