package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to20then2() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 0);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to24then2() {
        Point a = new Point(5, 4);
        Point b = new Point(2, 4);
        int expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when52to25then2() {
        Point a = new Point(5, 2);
        Point b = new Point(2, 5);
        int expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.30);
    }

    @Test
    public void when554To333then3() {
        Point a = new Point(5, 5, 4);
        Point b = new Point(3, 3, 3);
        int expected = 3;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when964To396then7() {
        Point a = new Point(9, 6, 4);
        Point b = new Point(3, 9, 6);
        int expected = 7;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}