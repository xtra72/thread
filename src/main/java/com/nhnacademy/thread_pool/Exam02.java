package com.nhnacademy.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam02 {

    public static void main(String[] args) {
        String[] urls = { "https://github.com/xtra72/thread/blob/main/doc/8.thread_pool/index.adoc"
        };
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String url : urls) {
            Runnable worker = new DownloadWorker(url);
            executor.execute(worker);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("모든 다운로드가 완료되었습니다.");
    }
}
