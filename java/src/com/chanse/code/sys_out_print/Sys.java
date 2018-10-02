package com.chanse.code.sys_out_print;

import java.io.FileDescriptor;
import java.io.FileOutputStream;

public final class Sys {

    public final static PStream out;

    static {
        FileOutputStream fos = new FileOutputStream(FileDescriptor.out);
        out = new PStream(fos);
    }

    private Sys() {
        // No object should be created
    }
}
