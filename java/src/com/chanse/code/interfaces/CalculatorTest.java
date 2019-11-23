package com.chanse.code.interfaces;

public class CalculatorTest {

    public static void main(String[] args) {
        var calc = new CalculatorImpl();
        calc.add(2, 3);
        calc.sub(2, 3);
        Calculator.mul(2, 3);
    }
}
