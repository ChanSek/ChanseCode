package com.chanse.code.SysOutPrint;

import java.io.*;

public class PStream extends FilterOutputStream {

    private BufferedWriter txtWriter;
    private OutputStreamWriter charWriter;

    public PStream(OutputStream out) {
        super(out);
        charWriter = new OutputStreamWriter(this);
        txtWriter = new BufferedWriter(charWriter);
    }

    public void println(String message) {
        write(message);
    }

    private void write(String msg) {
        try {
            synchronized (this) {
                ensureOpen();
                txtWriter.write(msg);
                txtWriter.newLine();
                txtWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ensureOpen() throws IOException {
        if (out == null) {
            throw new IOException("Stream is already closed");
        }
    }
}
