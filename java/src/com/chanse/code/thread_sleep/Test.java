package com.chanse.code.thread_sleep;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Date());
        Thread.sleep(2000);
        System.out.println(new Date());

        System.out.println();
        System.out.println(new Date() + "Custom sleep start");
        SleepingThread.sleep(2000);
        System.out.println(new Date() + "Custom sleep end");
    }
}
