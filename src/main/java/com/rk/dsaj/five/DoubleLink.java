package com.rk.dsaj.five;

public class DoubleLink {

    private int data;
    private DoubleLink next;
    private DoubleLink previous;

    public DoubleLink() {
        this.next = null;
        this.previous = null;
    }

    public DoubleLink(int data, DoubleLink next, DoubleLink previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLink getNext() {
        return next;
    }

    public void setNext(DoubleLink next) {
        this.next = next;
    }

    public DoubleLink getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLink previous) {
        this.previous = previous;
    }
}
