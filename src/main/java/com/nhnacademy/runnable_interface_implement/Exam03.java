package com.nhnacademy.runnable_interface_implement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam03 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.execute(new RunnableCounter("counter1", 5));
        pool.execute(new RunnableCounter("counter2", 5));
    }
}
