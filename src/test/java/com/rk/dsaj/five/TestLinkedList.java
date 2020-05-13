package com.rk.dsaj.five;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLinkedList extends BaseTest {

    private LinkedList linkedList;

    @BeforeEach
    public void setup() {
        linkedList = new LinkedList();
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        linkedList.insert(1);
        Assertions.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void testPeekEmpty() {
        Assertions.assertEquals(0, linkedList.peek());
    }

    @Test
    public void testPeekNotEmpty() {
        int value = 10;
        linkedList.insert(value);
        Assertions.assertEquals(value, linkedList.peek());
    }

    @Test
    public void testRemoveWhenEmpty() {
        Assertions.assertEquals(0, linkedList.remove());
    }

    @Test
    public void testRemoveLinks() {
        int value = 10;
        linkedList.insert(value);
        Assertions.assertEquals(value, linkedList.remove());
        Assertions.assertEquals(0, linkedList.remove());
    }

    @Test
    public void testInsertSingle() {
        int value = 10;
        linkedList.insert(value);
        linkedList.displayListData();
        Assertions.assertEquals(value, linkedList.peek());
    }

    @Test
    public void testInsertMultipleLinks() {
        int valueOne = 10;
        linkedList.insert(valueOne);
        int valueTwo = 20;
        linkedList.insert(valueTwo);
        linkedList.displayListData();
        Assertions.assertEquals(valueTwo, linkedList.peek());
    }
}
