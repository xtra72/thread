package com.nhnacademy.daemon;

public class Worker implements Runnable {
    Thread thread;
    int count = 0;
    long interval = 1000;

    public Worker(String name) {
        thread = new Thread(this, name);
    }

    public void start() {
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public void setDaemon(boolean on) {
        thread.setDaemon(on);
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                ++count;
                System.out.println(thread.getName() + " : " + count);
                Thread.sleep(interval);
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(thread.getName() + " : finished");
    }
}
