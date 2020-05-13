package com.rk.dsaj.five;

public class PriorityQueueLL {

    private DoubleLink first;

    public PriorityQueueLL() {
        this.first = null;
    }

    /**
     * will insert an item into the priority queue, smallest items are at the head of the line
     * @param data
     */
    public void insert(int data) {
        DoubleLink link = new DoubleLink();
        link.setData(data);
        if (first == null) {
            first = link;
        } else if (link.getData() < first.getData()) {
            link.setNext(first);
            first.setPrevious(link);
            first = link;
        } else {
            DoubleLink current = first;
            boolean insertPointFound = false;
            while (!insertPointFound) {
                if (link.getData() > current.getData()) {
                    if (current.getNext() == null) {
                        // at the end of the list, insert after current
                        current.setNext(link);
                        link.setPrevious(current);
                        insertPointFound = true;
                    } else {
                        current = current.getNext();
                    }
                } else {
                    // insert before current
                    DoubleLink temp = current.getPrevious();
                    link.setNext(current);
                    link.setPrevious(temp);
                    temp.setNext(link);
                    current.setPrevious(link);
                    insertPointFound = true;
                }
            }
        }
    }

    /**
     * Remove the first item on the queu
     * @return
     */
    public int remove() {
        int value = 0;
        if (first != null) {
            value = first.getData();
            first = first.getNext();
            if (first != null) {
                first.setPrevious(null);
            }
        }
        return value;
    }

    public int peek() {
        int value = 0;
        if (first != null) {
            value = first.getData();
        }
        return value;
    }

    public void printQueue() {
        DoubleLink current = first;
        System.out.println("Printing the Priority Queue");
        StringBuilder string = new StringBuilder();
        while (current != null) {
            string.append(current.getData()).append(" <--> ");
            current = current.getNext();
        }
        string.append("null");
        System.out.println(string);
    }
}
