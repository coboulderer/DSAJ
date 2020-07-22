package com.rk.dsaj.six;

public class BinarySearch {

    private int[] array;
    private int searchValue;

    /**
     * Performs a binary search on the input array, which is assumed to be sorted, for the specified value
     * @param input the input array
     * @param value the value to search for
     * @return boolean - true if the specified value is found, false otherwise
     */
    public boolean binarySearch(int[] input, int value) {
        boolean valueFound = false;
        this.array = input;
        this.searchValue = value;
        if (this.array != null) {
            valueFound = performBinarySearch(0, this.array.length);
        }
        return valueFound;
    }

    private boolean performBinarySearch(int lowIndex, int highIndex) {
        int searchIndex = (highIndex + lowIndex) / 2;
        int currentValue = this.array[searchIndex];
        if (currentValue == searchValue) {
            return true;
        } else if (currentValue > searchValue) {
            if (searchIndex == 0){
                return false;
            } else {
                return performBinarySearch(lowIndex, searchIndex - 1);
            }
        } else {
            if (searchIndex == array.length - 1) {
                return false;
            } else {
                return performBinarySearch(searchIndex + 1, highIndex);
            }
        }
    }
}
