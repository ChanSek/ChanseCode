package com.chanse.code.SysOutPrint;

import java.io.FileDescriptor;

public final class Sys {

    public final static PStream out;

    static {
        out = new PStream(FileDescriptor.out);
    }

    private Sys() {
        // No object should be created
    }
}
