package com.rk.dsaj.six;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMergeSort extends BaseTest {

    private MergeSort mergeSort;

    @BeforeEach
    public void setup() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testZeroLength() {
        long[] array = {};
        mergeSort.mergeSort(array);
        Assertions.assertEquals(0, array.length);
    }

    @Test
    public void testSingleLength() {
        long[] array = {10};
        mergeSort.mergeSort(array);
        Assertions.assertEquals(1, array.length);
        printArray(array);
    }

    @Test
    public void testEvenLengthSort() {
        long[] array = {100, 75, 50, 40};
        mergeSort.mergeSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            Assertions.assertTrue(array[i] <= array[i +1]);
        }
        printArray(array);
    }

    @Test
    public void testOddLengthSort() {
        long[] array = {20, 100, 75, 50, 40};
        mergeSort.mergeSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            Assertions.assertTrue(array[i] <= array[i + 1]);
        }
        printArray(array);
    }

    @Test
    public void testDuplicateValuesSort() {
        long[] array = {20, 100, 75, 50, 40, 20, 100};
        mergeSort.mergeSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            Assertions.assertTrue(array[i] <= array[i + 1]);
        }
        printArray(array);
    }
}
