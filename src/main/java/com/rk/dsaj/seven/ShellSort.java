package com.rk.dsaj.seven;

public class ShellSort {

    public long[] shellSort(long[] input) {
        if (input != null) {
            int gap = 1;
            while (gap <= input.length / 3) {
                gap = gap * 3 + 1;
            }
            int high, low;
            while (gap > 0) {
                for (high = gap; high < input.length; high++) {
                    long temp = input[high];
                    for (low = high; low >= gap && input[low - gap] > temp; low -= gap) {
                        input[low] = input[low - gap];
                    }
                    input[low] = temp;
                }

                gap = (gap - 1) / 3;
            }
        }
        return input;
    }

    public int[] shellSort(int[] input) {
        if (input != null) {
            int gap = 1;
            while (gap <= input.length / 3) {
                gap = gap * 3 + 1;
            }
            int high, low;
            while (gap > 0) {
                for (high = gap; high < input.length; high++) {
                    int temp = input[high];
                    for (low = high; low >= gap && input[low - gap] > temp; low -= gap) {
                        input[low] = input[low - gap];
                    }
                    input[low] = temp;
                }

                gap = (gap - 1) / 3;
            }
        }
        return input;
    }
}
