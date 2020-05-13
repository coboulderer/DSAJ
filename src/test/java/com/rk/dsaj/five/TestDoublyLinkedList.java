package com.rk.dsaj.five;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDoublyLinkedList extends BaseTest {

    private DoublyLinkedList doublyLinkedList;

    @BeforeEach
    public void setup() {
        doublyLinkedList = new DoublyLinkedList();
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(doublyLinkedList.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        doublyLinkedList.insert(5);
        Assertions.assertFalse(doublyLinkedList.isEmpty());
    }

    @Test
    public void testSingleInsert() {
        int data  = 10;
        doublyLinkedList.insert(data);
        Assertions.assertEquals(data, doublyLinkedList.peek());
    }

    @Test
    public void testMultipleInserts() {
        int dataOne  = 10;
        doublyLinkedList.insert(dataOne);
        Assertions.assertEquals(dataOne, doublyLinkedList.peek());

        int dataTwo = 20;
        doublyLinkedList.insert(dataTwo);
        Assertions.assertEquals(dataTwo, doublyLinkedList.peek());
    }

    @Test
    public void testInsertAfter() {
        int dataOne  = 10;
        doublyLinkedList.insert(dataOne);

        int dataTwo = 20;
        doublyLinkedList.insertAfter(dataTwo, dataOne);
        Assertions.assertEquals(dataOne, doublyLinkedList.remove());
        Assertions.assertEquals(dataTwo, doublyLinkedList.remove());
    }

    @Test
    public void testInsertAfterEmptyList() {
        int dataOne  = 10;
        doublyLinkedList.insertAfter(dataOne , 50);
        Assertions.assertEquals(dataOne, doublyLinkedList.remove());
    }

    @Test
    public void testInsertAfterMissingKey() {
        int dataOne  = 10;
        doublyLinkedList.insert(dataOne);
        int dataTwo  = 15;
        doublyLinkedList.insert(dataTwo);

        int dataThree = 30;
        doublyLinkedList.insertAfter(dataThree, 150);
        Assertions.assertEquals(dataThree, doublyLinkedList.remove());
    }

    @Test
    public void testInsertBefore() {
        int dataOne  = 10;
        doublyLinkedList.insert(dataOne);

        int dataTwo = 20;
        doublyLinkedList.insertBefore(dataTwo, dataOne);
        Assertions.assertEquals(dataTwo, doublyLinkedList.remove());
        Assertions.assertEquals(dataOne, doublyLinkedList.remove());
    }

    @Test
    public void testInsertBeforeEmptyList() {
        int dataOne  = 10;
        doublyLinkedList.insertBefore(dataOne , 50);
        Assertions.assertEquals(dataOne, doublyLinkedList.remove());
    }

    @Test
    public void testInsertBeforeMissingKey() {
        int dataOne  = 10;
        doublyLinkedList.insert(dataOne);
        int dataTwo  = 15;
        doublyLinkedList.insert(dataTwo);

        int dataThree = 30;
        doublyLinkedList.insertBefore(dataThree, 150);
        Assertions.assertEquals(dataThree, doublyLinkedList.remove());
    }
}
