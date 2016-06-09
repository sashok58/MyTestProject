package com.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Z on 5/30/2016.
 */
public class MultiThreadingSample {
    private static final long startTime = System.nanoTime();
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {

            exec.execute(new MultiThread());
            exec.shutdown();

                    }

    }
}

