package com.rk.dsaj.two;

public class HighArray {

    private long[] array;
    private int nElements;
    private int size;

    /**
     * Default constructor
     * @param size
     */
    public HighArray(int size) {
        array = new long[size];
        nElements = 0;
        this.size = size;
    }

    public boolean isValuePresent(long value) {
        boolean valueFound = false;
        for (int i = 0; i < nElements; i++) {
            if (array[i] == value) {
                valueFound = true;
                break;
            }
        }
        return valueFound;
    }

    public void insertValue(long value) {
        array[nElements] = value;
        nElements++;
    }

    public boolean deleteValue(long value) {
        boolean valueDeleted = false;
        int index;
        for (index = 0; index < nElements; index++) {
            if (array[index] == value) {
                valueDeleted = true;
                break;
            }
        }
        for (; index < nElements; index++) {
            if (index != nElements - 1) {
                array[index] = array[index + 1];
            } else {
                array[index] = 0;
                nElements--;
            }
        }
        return valueDeleted;
    }

    public long getMax() {
        if (nElements == 0) {
            return -1;
        } else {
            long currentMax = array[0];
            for (int i = 1; i < nElements; i++) {
                if (array[i] > currentMax) {
                    currentMax = array[i];
                }
            }
            return currentMax;
        }
    }

    public long removeMaxValue() {
        long maxValue = this.getMax();
        this.deleteValue(maxValue);
        return maxValue;
    }

    public void printHighArray() {
        String output = "[ ";
        for (int i = 0; i < nElements; i++) {
            output = output + array[i] + " ";
        }
        output = output + "]";
        System.out.println(output);
    }
}
