package com.rk.dsaj.six;

public class MergeSort {

    public void mergeSort(long[] input) {
        long[] aux = new long[input.length];
        mergeSort(input, aux, 0, input.length - 1);
    }

    private void mergeSort(long[] input, long[] aux, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex) {
            return;
        }

        int midpoint = (lowIndex + highIndex) / 2;
        mergeSort(input, aux, lowIndex, midpoint);
        mergeSort(input, aux, midpoint + 1, highIndex);
        merge(input, aux, lowIndex, midpoint, highIndex);
    }

    private void merge(long[] input, long[] aux, int lowIndex, int midpoint, int highIndex) {
        for (int k = lowIndex; k <= highIndex; k++) {
            aux[k] = input[k];
        }

        int i  = lowIndex;
        int j = midpoint + 1;
        for (int k = lowIndex; k <= highIndex; k++) {
            if (i > midpoint) {
                input[k] = aux[j++];
            } else if (j > highIndex) {
                input[k] = aux[i++];
            } else if (aux[j] > aux[i]) {
                input[k] = aux[i++];
            } else {
                input[k] = aux[j++];
            }
        }
    }
}
