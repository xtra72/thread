package com.nhnacademy.daemon;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker("worker1");
        Worker worker2 = new Worker("worker2");

        worker2.setDaemon(true);

        worker1.start();
        worker2.start();

        Thread.sleep(5000);
        worker1.stop();

        System.out.println("Main Thread terminated");
    }
}
