package com.nhnacademy.example;

import java.util.concurrent.ThreadLocalRandom;

public class Producer extends Thread {
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
    }
}