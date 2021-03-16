package com.altynnikov.se.concurrency.lesson3;

public class Sequence {
    private int value = 0;

    public synchronized int getNext() {
        value++;
        return value;
    }
}
