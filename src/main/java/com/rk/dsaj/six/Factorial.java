package com.rk.dsaj.six;

public class Factorial {

    public int getFactorial(int factor) {
        if (factor == 0 || factor == 1) {
            return 1;
        } else {
            return factor * getFactorial(factor - 1);
        }
    }
}
