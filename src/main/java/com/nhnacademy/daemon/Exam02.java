package com.nhnacademy.daemon;

public class Exam02 {
    public static void main(String[] args) throws InterruptedException {

        Worker2 worker1 = new Worker2("worker1");

        worker1.start();

        Thread.sleep(5000);
        worker1.stop();

        System.out.println("Main Thread terminated");
    }
}
