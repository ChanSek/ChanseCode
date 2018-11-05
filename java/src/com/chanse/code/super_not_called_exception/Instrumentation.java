package com.chanse.code.super_not_called_exception;

public class Instrumentation {

    public void callActivityOnCreate(Activity activity) {
        activity.onCreate();
    }
}
