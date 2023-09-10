package com.nhnacademy.state;

public class Exam04 {
    public static void main(String[] args) throws InterruptedException {
        Thread counter = new Thread(() -> {
            int count = 0;
            int maxCount = 10;

            while (!Thread.currentThread().isInterrupted() && (count < maxCount)) {
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread waitingCounter = new Thread(() -> {
            try {
                counter.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        counter.start();
        waitingCounter.start();

        Thread.State state = waitingCounter.getState();
        System.out.println(state);

        while (waitingCounter.isAlive()) {
            if (state != waitingCounter.getState()) {
                state = waitingCounter.getState();
                System.out.println(state);
            }
        }
    }
}
