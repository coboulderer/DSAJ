package com.rk.dsaj.six;

public class PowerCalc {

    public long calculate(long base, long exponent) {
        long ans = 0;
        if (exponent == 0) {
            ans = 1;
        } else {
            if (exponent == 1) {
                ans = base;
            } else {
                ans = calculate(base * base, exponent / 2);
                if (exponent % 2 != 0) {
                    ans = ans * base;
                }
            }
        }
        return ans;
    }
}
