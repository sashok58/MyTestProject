package com.test;

import java.util.Map;
import java.util.Random;

/**
 * Created by Z on 5/30/2016.
 */
public class MultiThread implements Runnable {
    protected int countDown=100_000;
    private static int count=0;
    private final int id=count++;
    @Override
    public void run() {
        final long startTime=System.nanoTime();
while(countDown-- > 0){
    //System.out.println(status());
    Thread.yield();
}
        System.out.println("end " + id);
        System.out.println((System.nanoTime()-startTime)/10E9);
    }
    public String status(){

        return "id:" + id + " count:" + countDown;

    }

}
