package com.chanse.code.interfaces;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("A = " + a + ", B = " + b);
        return a - b;
    }
}
