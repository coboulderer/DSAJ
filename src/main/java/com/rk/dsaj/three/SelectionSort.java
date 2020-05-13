package com.rk.dsaj.three;

import java.lang.reflect.Array;

/**
 * Selection Sort Notes
 * Runs in O(n^2), however is faster than Bubblesort due to less swaps, especially if
 * n is small
 */
public class SelectionSort {

    private long[] array;

    public long[] selectionSort(long[] input) {
        this.array = input;
        if (array != null) {
            int length = Array.getLength(array);
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[minIndex] > array[j]) {
                        minIndex = j;
                    }
                }
                if (i != minIndex) {
                    swap(i, minIndex);
                }
            }
        }
        return array;
    }

    private void swap(int lowIndex, int highIndex) {
        long temp = array[highIndex];
        array[highIndex] = array[lowIndex];
        array[lowIndex] = temp;
    }
}
