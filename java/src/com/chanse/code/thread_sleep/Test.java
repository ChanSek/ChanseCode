package com.chanse.code.thread_sleep;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Date() + " - Beginning of the execution");
        java.lang.Thread.sleep(1000);
        java.lang.Thread.sleep(1000, 30000);
        System.out.println(new Date() + " - End of the execution");

        System.out.println();

        System.out.println(new Date() + " - Beginning of the custom execution");
        Thread.sleep(1000);
        System.out.println(new Date() + " - End of the custom execution");
    }
}
