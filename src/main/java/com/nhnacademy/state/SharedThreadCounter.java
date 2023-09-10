package com.nhnacademy.state;

public class SharedThreadCounter implements Runnable {
    static int count = 0;
    int maxCount;
    Thread thread;

    public SharedThreadCounter(String name, int maxCount) {
        thread = new Thread(this, name);
        this.maxCount = maxCount;
    }

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void start() {
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                if (SharedThreadCounter.getCount() < maxCount) {
                    increment();
                    Thread.sleep(1000);
                } else {
                    stop();
                }
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
