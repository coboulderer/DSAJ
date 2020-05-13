package com.rk.dsaj.three;

import java.lang.reflect.Array;

/**
 * Insertion Sort Notes
 * Runs in O(n^2) as well, but performs better than other elementary sorts if
 * data is already partially sorted
 * In the worst case scenario, a completely inverted array, insertion sort == bubble sort
 */
public class InsertionSort {

    private long[] array;

    public long[] insertionSort(long[] input) {
        this.array = input;
        if (array != null) {
            int length = Array.getLength(array);
            for (int i = 1; i < length; i++) {
                for (int j = i - 1; j >= 0; j--, i--) {
                    if (array[i] < array[j]) {
                        long temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    else {
                        break;  //exit the inner for loop
                    }
                }
            }
        }
        return array;
    }
}
