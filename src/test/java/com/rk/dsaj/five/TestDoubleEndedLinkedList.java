package com.rk.dsaj.five;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDoubleEndedLinkedList extends BaseTest {

    private DoubleEndedLinkedList doubleEndedLinkedList;

    @BeforeEach
    public void setup() {
        doubleEndedLinkedList = new DoubleEndedLinkedList();
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(doubleEndedLinkedList.isEmpty());
    }

    @Test
    public void testIsNotEmptyInsertFirst() {
        doubleEndedLinkedList.insertFirst(1);
        Assertions.assertFalse(doubleEndedLinkedList.isEmpty());
    }

    @Test
    public void testIsNotEmptyInsertLast() {
        doubleEndedLinkedList.insertLast(1);
        Assertions.assertFalse(doubleEndedLinkedList.isEmpty());
    }

    @Test
    public void testPeekFirstEmpty() {
        Assertions.assertEquals(0, doubleEndedLinkedList.peekFirst());
    }

    @Test
    public void testPeekFirstNotEmpty() {
        int value = 10;
        doubleEndedLinkedList.insertFirst(value);
        Assertions.assertEquals(value, doubleEndedLinkedList.peekFirst());
    }

    @Test
    public void testPeekLastEmpty() {
        Assertions.assertEquals(0, doubleEndedLinkedList.peekLast());
    }

    @Test
    public void testPeekLastNotEmpty() {
        int value = 10;
        doubleEndedLinkedList.insertLast(value);
        Assertions.assertEquals(value, doubleEndedLinkedList.peekLast());
    }

    @Test
    public void testRemoveWhenEmpty() {
        Assertions.assertEquals(0, doubleEndedLinkedList.remove());
    }

    @Test
    public void testRemoveLinks() {
        int value = 10;
        doubleEndedLinkedList.insertFirst(value);
        Assertions.assertEquals(value, doubleEndedLinkedList.remove());
        Assertions.assertEquals(0, doubleEndedLinkedList.remove());
    }

    @Test
    public void testInsertFirstSingle() {
        int value = 10;
        doubleEndedLinkedList.insertFirst(value);
        Assertions.assertEquals(value, doubleEndedLinkedList.peekFirst());
        Assertions.assertEquals(value, doubleEndedLinkedList.peekLast());
    }

    @Test
    public void testInsertLastSingle() {
        int value = 10;
        doubleEndedLinkedList.insertLast(value);
        Assertions.assertEquals(value, doubleEndedLinkedList.peekFirst());
        Assertions.assertEquals(value, doubleEndedLinkedList.peekLast());
    }

    @Test
    public void testInsertMultipleLinks() {
        int valueOne = 10;
        doubleEndedLinkedList.insertFirst(valueOne);
        int valueTwo = 20;
        doubleEndedLinkedList.insertFirst(valueTwo);
        Assertions.assertEquals(valueTwo, doubleEndedLinkedList.peekFirst());
        Assertions.assertEquals(valueOne, doubleEndedLinkedList.peekLast());
        int valueThree = 30;
        doubleEndedLinkedList.insertLast(valueThree);
        Assertions.assertEquals(valueThree, doubleEndedLinkedList.peekLast());
        Assertions.assertEquals(valueTwo, doubleEndedLinkedList.peekFirst());
    }
}
