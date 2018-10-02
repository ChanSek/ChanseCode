package com.chanse.code.thread_sleep;

public class Thread {

    private static int dummyValue = Integer.MAX_VALUE;

    public static void sleep(long millis) {
//        for (int i = 0; i < 1000000000; i++) {
//            // Dummy Logic
//            dummyValue = dummyValue << 1;
//        }

        long start = System.currentTimeMillis();
        while (true) {
            long now = System.currentTimeMillis();
            long elapsed = now - start;
            if (elapsed >= millis) {
                break;
            }
        }
    }

    public static int getDummyValue() {
        return dummyValue;
    }
}
