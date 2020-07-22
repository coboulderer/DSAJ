package com.rk.dsaj.six;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPowerCalc extends BaseTest {

    private PowerCalc powerCalc;

    @BeforeEach
    public void setup() {
        powerCalc = new PowerCalc();
    }

    @Test
    public void testZeroPower() {
        long ans = powerCalc.calculate(5, 0);
        Assertions.assertEquals(1, ans);
    }

    @Test
    public void testFirstPower() {
        long ans = powerCalc.calculate(5, 1);
        Assertions.assertEquals(5, ans);
    }

    @Test
    public void testSquaredPower() {
        long ans = powerCalc.calculate(5, 2);
        Assertions.assertEquals(25, ans);
    }

    @Test
    public void testCubedPower() {
        long ans = powerCalc.calculate(5, 3);
        Assertions.assertEquals(125, ans);
    }

    @Test
    public void testOtherPower() {
        long ans = powerCalc.calculate(2, 8);
        Assertions.assertEquals(256, ans);
    }

    @Test
    public void testMorePowers() {
        long ans = powerCalc.calculate(3, 18);
        Assertions.assertEquals(387420489, ans);
    }


}
