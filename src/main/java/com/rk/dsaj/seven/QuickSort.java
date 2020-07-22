package com.rk.dsaj.seven;

import java.util.Random;

public class QuickSort {

    private int[] data;

    public int[] quicksort(int[] input) {
        this.data = input;
        if (this.data != null && this.data.length > 1) {
            sort(0, data.length - 1);
        }
        return this.data;
    }

    private void sort(int leftPtr, int rightPtr) {
        if (leftPtr < rightPtr) {
            int pivot = getPivot(leftPtr, rightPtr);
            if (pivot != leftPtr) {
                swapElements(leftPtr, pivot);
            }
            pivot = partition(leftPtr, rightPtr);
            sort(leftPtr, pivot - 1);
            sort(pivot + 1, rightPtr);
        }
    }

    private void swapElements(int indexOne, int indexTwo) {
        int temp = data[indexOne];
        data[indexOne] = data[indexTwo];
        data[indexTwo] = temp;
    }

    private int partition(int leftPtr, int rightPtr) {
        long pivotValue = data[leftPtr];
        int i = leftPtr + 1;
        for (int j = i; j <= rightPtr; j++) {
            if (data[j] < pivotValue) {
                swapElements(j, i);
                i++;
            }
        }
        swapElements(leftPtr, --i);
        return i;
    }

    private int getPivot(int leftPtr, int rightPtr) {
        Random random = new Random();
        return random.nextInt(rightPtr - leftPtr + 1) + leftPtr;
    }
}
