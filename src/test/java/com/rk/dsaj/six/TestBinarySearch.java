package com.rk.dsaj.six;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBinarySearch extends BaseTest {

    private BinarySearch binarySearch;

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void testBinarySearchLengthOneFound() {
        int[] array = {5};
        boolean results = binarySearch.binarySearch(array, 5);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchLengthOneNotFoundLarger() {
        int[] array = {5};
        boolean results = binarySearch.binarySearch(array, 10);
        Assertions.assertFalse(results);
    }

    @Test
    public void testBinarySearchLengthOneNotFoundSmaller() {
        int[] array = {5};
        boolean results = binarySearch.binarySearch(array, 1);
        Assertions.assertFalse(results);
    }

    @Test
    public void testBinarySearchFoundLargerEvenLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45, 50};
        boolean results = binarySearch.binarySearch(array, 45);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundSmallerEvenLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45, 50};
        boolean results = binarySearch.binarySearch(array, 10);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundZeroIndexEvenLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45, 50};
        boolean results = binarySearch.binarySearch(array, 5);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundMaxIndexEvenLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45, 50};
        boolean results = binarySearch.binarySearch(array, 50);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundEachValueEvenLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45, 50};
        for (int value : array) {
            boolean results = binarySearch.binarySearch(array, value);
            Assertions.assertTrue(results);
        }
    }

    @Test
    public void testBinarySearchFoundLargerOddLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45};
        boolean results = binarySearch.binarySearch(array, 30);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundSmallerOddLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45};
        boolean results = binarySearch.binarySearch(array, 10);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundZeroIndexOddLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45};
        boolean results = binarySearch.binarySearch(array, 5);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundMaxIndexOddLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45};
        boolean results = binarySearch.binarySearch(array, 45);
        Assertions.assertTrue(results);
    }

    @Test
    public void testBinarySearchFoundEachValueOddLength() {
        int[] array = {5, 10, 15, 20, 25, 30, 45};
        for (int value : array) {
            boolean results = binarySearch.binarySearch(array, value);
            Assertions.assertTrue(results);
        }
    }
}
