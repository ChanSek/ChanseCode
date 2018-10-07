package com.chanse.code.thread_sleep;

public class SleepingThread {

    public static void sleep(long millis) throws InterruptedException {
        sleep(millis, 0);
    }

    public static void sleep(long millis, long nanos) throws InterruptedException {
        if (millis < 0 || nanos < 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        if (nanos > 999999) {
            throw new IllegalArgumentException("invalid Input");
        }

        if (millis == 0 && nanos == 0) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            return;
        }

        long start = System.nanoTime();
        long duration = millis * 1000000 + nanos;

        while (true) {
            long now = System.nanoTime();
            long elapsed = now - start;

            if (elapsed >= duration) break;
        }
    }
}
