package com.chanse.code.super_not_called_exception;

public class Test {

    public static void main(String[] args) {
        TestActivity activity = new TestActivity();
        Instrumentation instrumentation = new Instrumentation();
        activity.attach(instrumentation);
        activity.performCreate();
    }
}
