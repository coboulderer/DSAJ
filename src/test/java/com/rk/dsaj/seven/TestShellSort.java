package com.rk.dsaj.seven;

import com.rk.dsaj.BaseTest;
import java.lang.reflect.Array;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestShellSort extends BaseTest {

    private ShellSort shellSort = new ShellSort();

    @Test
    public void testSortInversed() {
        long[] input = {5, 4, 3, 2, 1};
        input = shellSort.shellSort(input);
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
        input = shellSort.shellSort(input);
        printArray(input);
        for (int i = 1; i < input.length; i++) {
            Assertions.assertTrue(input[i - 1] < input[i]);
        }
    }

    @Test
    public void testSortRandomizedInts() {
        int size = 100;
        int[] input = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            input[i] = random.nextInt(100);
        }
        input = shellSort.shellSort(input);
        for (int i = 1; i < input.length; i++) {
            Assertions.assertTrue(input[i - 1] <= input[i]);
        }
    }

    @Test
    public void testSortLengthOne() {
        long[] array = {1};
        array = shellSort.shellSort(array);
        Assertions.assertEquals(array[0], 1);
    }

    @Test
    public void testSortLengthZero() {
        long[] array = {};
        array = shellSort.shellSort(array);
        Assertions.assertEquals(Array.getLength(array), 0);
    }

    @Test
    public void testNullInput() {
        long[] array = null;
        array = shellSort.shellSort(array);
        Assertions.assertNull(array);
    }
}
