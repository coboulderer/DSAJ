package com.rk.dsaj.six;

import com.rk.dsaj.BaseTest;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestKnapsack extends BaseTest {

    private Knapsack knapsack;

    @BeforeEach
    public void setup() {
        knapsack = new Knapsack();
    }

    @Test
    public void testDsajExample() {
        int[] input = {11, 8, 7, 6, 5};
        ArrayList<Integer> sack = knapsack.fillKnapsack(input, 20);
        Assertions.assertFalse(sack.isEmpty());
    }

}
