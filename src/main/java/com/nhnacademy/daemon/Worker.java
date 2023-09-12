package com.nhnacademy.daemon;

public class Worker extends RunnableCounter {
    RunnableCounter worker;

    public Worker(String name, int maxCount) {
        super(name, maxCount);
        worker = new RunnableCounter("internal workder", maxCount);
        worker.setDaemon(true);
    }

    @Override
    public void run() {
        worker.start();

        super.run();
    }
}
