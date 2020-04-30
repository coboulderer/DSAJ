package com.rk.dsaj.three;

import java.lang.reflect.Array;

/**
 *  Bubblesort Notes
 *  Runs in O(n^2) time
 */
public class BubbleSort {

    private long[] array;

    public long[] bubbleSort(long[] input) {
        this.array = input;
        if (array != null) {
            int length = Array.getLength(array);
            for (int i = 0; i < length - 1; i++) {
                for (int j = 1; j < length - i; j++) {
                    if (array[j - 1] > array[j]) {
                        swap(j);
                    }
                }
            }
        }
        return array;
    }

    private void swap(int swapIndex) {
        long temp = array[swapIndex];
        array[swapIndex] = array[swapIndex - 1];
        array[swapIndex - 1] = temp;
    }
}
