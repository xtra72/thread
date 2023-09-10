package com.nhnacademy.state;

import com.nhnacademy.thread_class_extension.ThreadCounter;

public class Exam02 {
    public static void main(String[] args) {
        Thread thread = new ThreadCounter("counter", 5);

        thread.start();
        System.out.println(thread.getState());
    }
}
