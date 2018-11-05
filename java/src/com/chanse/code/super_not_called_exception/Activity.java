package com.chanse.code.super_not_called_exception;

public class Activity {

    private boolean mCalled = false;
    private Instrumentation mInstrumentation;

    protected void onCreate() {
        mCalled = true;
    }

    final void attach(Instrumentation instrumentation) {
        mInstrumentation = instrumentation;
    }

    final void performCreate() {
        mCalled = false;
        mInstrumentation.callActivityOnCreate(this);
        if (!mCalled) {
            throw new SuperNotCalledException("Call super.onCreate()");
        }
    }
}
