package com.rk.dsaj.four;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPostFixCalculator extends BaseTest {

    private PostFixCalculator postFixCalculator = new PostFixCalculator();

    @Test
    public void testNullInput() {
        long ans = postFixCalculator.postFixCalculate(null);
        Assertions.assertEquals(0, ans);
    }

    @Test
    public void testZeroLengthInput() {
        long ans = postFixCalculator.postFixCalculate("");
        Assertions.assertEquals(0, ans);
    }

    @Test
    public void testNoOperationInput() {
        String input = "5";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(5, ans);
    }

    @Test
    public void testSimplePostFixAddition() {
        String input = "2 4 +";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(6, ans);
    }

    @Test
    public void testSimplePostFixSubtraction() {
        String input = "5 2 -";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(3, ans);
    }

    @Test
    public void testSimplePostFixMultiplication() {
        String input = "9 3 *";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(27, ans);
    }

    @Test
    public void testSimplePostFixDivision() {
        String input = "8 4 /";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(2, ans);
    }

    @Test
    public void testPostFixMultipleOps() {
        String input = "3 4 5 + * 6 1 2 + / -";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(25, ans);
    }

    @Test
    public void testMultiDigitAddition() {
        String input = "12 14 +";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(26, ans);
    }

    @Test
    public void testBigDigitAddition() {
        String input = "500 423 +";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(923, ans);
    }

    @Test
    public void testMultDigitSubtraction() {
        String input = "50 22 -";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(28, ans);
    }

    @Test
    public void testBigDigitSubtraction() {
        String input = "250 123 -";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(127, ans);
    }

    @Test
    public void testBigDigitMultiplication() {
        String input = "12 12 *";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(144, ans);
    }

    @Test
    public void testBigDigitDivision() {
        String input = "288 12 /";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(24, ans);
    }
}
