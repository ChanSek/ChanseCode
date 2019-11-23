package com.chanse.code.interfaces;

public interface Calculator {
    int x = 10;

    int add(int a, int b);

    default int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}
