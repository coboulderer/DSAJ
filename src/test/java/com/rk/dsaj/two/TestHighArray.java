package com.rk.dsaj.two;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHighArray extends BaseTest {

    private HighArray highArray;

    @BeforeEach
    public void setup() {
        highArray = new HighArray(5);
        highArray.insertValue(1);
        highArray.insertValue(2);
        highArray.insertValue(3);
        highArray.insertValue(4);
        highArray.insertValue(5);
    }

    @Test
    public void testIsValuePresent() {
        Assertions.assertTrue(highArray.isValuePresent(3));
    }

    @Test
    public void testIsValueNotPresent() {
        Assertions.assertFalse(highArray.isValuePresent(6));
    }

    @Test
    public void testDeleteFirstValue() {
        highArray.deleteValue(1);
        highArray.printHighArray();
        Assertions.assertFalse(highArray.isValuePresent(1));
    }

    @Test
    public void testDeleteMiddleValue() {
        highArray.deleteValue(3);
        highArray.printHighArray();
        Assertions.assertFalse(highArray.isValuePresent(3));
    }

    @Test
    public void testDeleteEndValue() {
        highArray.deleteValue(5);
        highArray.printHighArray();
        Assertions.assertFalse(highArray.isValuePresent(5));
    }

    @Test
    public void testGetMax() {
        Assertions.assertEquals(5, highArray.getMax());
    }

    @Test
    public void testGetMaxEmptyArray() {
        highArray = new HighArray(5);
        Assertions.assertEquals(-1, highArray.getMax());
    }

    @Test
    public void testRemoveMaxValue() {
        Assertions.assertEquals(5, highArray.removeMaxValue());
    }
}

