package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {30,10,20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {85, 17, 44, 2, 555};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 17, 44, 85, 555};
        Assert.assertArrayEquals(expected, result);
    }
}