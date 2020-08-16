package com.chanse.code.delegation;

import kotlin.Lazy;

public class CustomLazyImpl<String> implements Lazy<String> {

    private String value;

    @Override
    public String getValue() {
        synchronized (this) {
            if (value != null) return (String) value;
            else {
                return (String) null;
            }
        }
    }

    @Override
    public boolean isInitialized() {
        return false;
    }
}
