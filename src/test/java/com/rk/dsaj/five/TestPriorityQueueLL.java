package com.rk.dsaj.five;

import com.rk.dsaj.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPriorityQueueLL extends BaseTest {

    private PriorityQueueLL priorityQueue;

    @BeforeEach
    public void setup() {
        priorityQueue = new PriorityQueueLL();
    }

    @Test
    public void testInsertEmpty() {
        int value = 10;
        priorityQueue.insert(value);
        Assertions.assertEquals(value, priorityQueue.peek());
    }

    @Test
    public void testInsertValueSmallerThanFirst() {
        int valueOne = 10;
        int valueTwo = 5;
        priorityQueue.insert(valueOne);
        priorityQueue.insert(valueTwo);
        Assertions.assertEquals(valueTwo, priorityQueue.peek());
    }

    @Test
    public void testInsertValueLargerThanFirst() {
        int valueOne = 10;
        int valueTwo = 20;
        priorityQueue.insert(valueOne);
        priorityQueue.insert(valueTwo);
        Assertions.assertEquals(valueOne, priorityQueue.remove());
        Assertions.assertEquals(valueTwo, priorityQueue.remove());
    }

    @Test
    public void testInsertBetweenTwoValues() {
        int valueOne = 10;
        int valueTwo = 20;
        int valueThree = 15;
        priorityQueue.insert(valueOne);
        priorityQueue.insert(valueTwo);
        priorityQueue.insert(valueThree);
        Assertions.assertEquals(valueOne, priorityQueue.remove());
        Assertions.assertEquals(valueThree, priorityQueue.remove());
        Assertions.assertEquals(valueTwo, priorityQueue.remove());
    }

    @Test
    public void testInsertAfterEmptyingQueue() {
        int valueOne = 10;
        int valueTwo = 20;
        priorityQueue.insert(valueOne);
        Assertions.assertEquals(valueOne, priorityQueue.remove());
        priorityQueue.insert(valueTwo);
        Assertions.assertEquals(valueTwo, priorityQueue.remove());
    }
}
