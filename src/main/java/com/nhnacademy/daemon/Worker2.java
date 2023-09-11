package com.nhnacademy.daemon;

public class Worker2 implements Runnable {
    Thread thread;
    int count = 0;
    long interval = 1000;
    Worker worker;

    public Worker2(String name) {
        thread = new Thread(this, name);
        worker = new Worker("internal workder");
        worker.setDaemon(true);
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
        worker.start();

        while (!Thread.currentThread().isInterrupted()) {
            try {
                ++count;
                System.out.println(thread.getName() + " : " + count);
                Thread.sleep(interval);
            } catch (InterruptedException ignore) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
