package com.rk.dsaj.seven;

import com.rk.dsaj.BaseTest;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuickSort extends BaseTest {

    private QuickSort quickSort = new QuickSort();

    @Test
    public void testNullInput() {
        int[] input = null;
        Assertions.assertNull(quickSort.quicksort(input));
    }

    @Test
    public void testLengthOne() {
        int[] input = {5};
        Assertions.assertEquals(1, (quickSort.quicksort(input)).length);
    }

    @Test
    public void testLengthTwo() {
        int[] input = {5,1};
        Assertions.assertEquals(2, (quickSort.quicksort(input)).length);
        for (int j = 0; j < input.length - 1; j++) {
            Assertions.assertTrue(input[j] <= input[j + 1]);
        }
    }

    @Test
    public void testSortRandom() {
        Random random = new Random();
        int length = 50;
        int[] input = new int[length];
        for (int i = 0; i < length; i++) {
            input[i] = random.nextInt(length);
        }
        input = quickSort.quicksort(input);
        for (int j = 0; j < input.length - 1; j++) {
            Assertions.assertTrue(input[j] <= input[j + 1]);
        }

    }
}
