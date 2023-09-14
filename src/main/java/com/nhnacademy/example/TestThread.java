package com.nhnacademy.example;

public class TestThread extends Thread {

    @Override
    public void run() {
        while (Thread.currentThread().isInterrupted()) {
            try {

                Thread.sleep(100);
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {

    }
}
