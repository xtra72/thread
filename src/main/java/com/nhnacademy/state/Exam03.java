package com.nhnacademy.state;

public class Exam03 {
    public static void main(String[] args) throws InterruptedException {
        SharedThreadCounter counter1 = new SharedThreadCounter("counter1", 5);
        SharedThreadCounter counter2 = new SharedThreadCounter("counter2", 5);

        counter1.start();
        counter2.start();

        while (counter1.getThread().isAlive() || counter2.getThread().isAlive()) {
            System.out.println("T1 : " + counter1.getThread().getState()
                    + ", T2 : " + counter2.getThread().getState());
            Thread.sleep(500);
        }
    }
}
