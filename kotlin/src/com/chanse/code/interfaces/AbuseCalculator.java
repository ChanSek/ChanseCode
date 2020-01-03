package com.chanse.code.interfaces;

public class AbuseCalculator {

    public static void main(String[] args) {
        var defaultCalculator = new DefaultCalculator();
        int result = DefaultCalculator.DefaultImpls.sub(defaultCalculator, 10, 20);
        int res = defaultCalculator.sub(10, 20);
        System.out.println(result);
        System.out.println(res);
    }
}
