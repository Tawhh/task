package com.task.schedule.test;

/**
 * Created by t420 on 2017/5/5.
 */
public class ThreadCount implements Runnable {
    public int p = 100;

    @Override
    public void run() {
        while (p > 0) {
            System.out.println(p + Thread.currentThread().getName());
            p--;
        }
    }
}
