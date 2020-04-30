package com.rk.dsaj.three;

import java.lang.reflect.Array;
import java.util.Random;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBubbleSort extends BaseTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSortInversed() {
        long[] input = {5, 4, 3, 2, 1};
        input = bubbleSort.bubbleSort(input);
        printArray(input);
        for (int i = 0; i < Array.getLength(input) - 1; i++) {
            Assertions.assertTrue(input[i] < input[i + 1]);
        }
    }

    @Test
    public void testSortRandomized() {
        int size = 100;
        long[] input = new long[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            input[i] = random.nextLong();
        }
        input = bubbleSort.bubbleSort(input);
        printArray(input);
        for (int i = 0; i < size - 1; i++) {
            Assertions.assertTrue(input[i] < input[i + 1]);
        }
    }

    @Test
    public void testSortLengthOne() {
        long[] array = {1};
        array = bubbleSort.bubbleSort(array);
        Assertions.assertEquals(array[0], 1);
    }

    @Test
    public void testSortLengthZero() {
        long[] array = {};
        array = bubbleSort.bubbleSort(array);
        Assertions.assertEquals(Array.getLength(array), 0);
    }

    @Test
    public void testNullInput() {
        long[] array = null;
        array = bubbleSort.bubbleSort(array);
        Assertions.assertNull(array);
    }
}
