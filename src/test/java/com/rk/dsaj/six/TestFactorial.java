package com.rk.dsaj.six;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorial extends BaseTest {

    Factorial factorial;

    @BeforeEach
    public void setup() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfZero() {
        Assertions.assertEquals(1, factorial.getFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        Assertions.assertEquals(1, factorial.getFactorial(1));
    }

    @Test
    public void testFactorialofTwo() {
        Assertions.assertEquals(2, factorial.getFactorial(2));
    }

    @Test
    public void testFactorialOfFive() {
        Assertions.assertEquals(120, factorial.getFactorial(5));
    }
}
