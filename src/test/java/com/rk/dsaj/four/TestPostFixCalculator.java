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
        String input = "24+";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(6, ans);
    }

    @Test
    public void testSimplePostFixSubtraction() {
        String input = "52-";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(3, ans);
    }

    @Test
    public void testSimplePostFixMultiplication() {
        String input = "93*";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(27, ans);
    }

    @Test
    public void testSimplePostFixDivision() {
        String input = "84/";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(2, ans);
    }

    @Test
    public void testPostFixMultipleOps() {
        String input = "345+*612+/-";
        long ans = postFixCalculator.postFixCalculate(input);
        Assertions.assertEquals(25, ans);
    }
}
