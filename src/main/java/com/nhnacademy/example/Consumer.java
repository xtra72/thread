package com.nhnacademy.example;

public class Consumer extends Thread {
    Store store;

    public Consumer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
    }
}
