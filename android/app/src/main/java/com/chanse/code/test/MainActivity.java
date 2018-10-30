package com.chanse.code.test;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Thread uiThread;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uiThread = Thread.currentThread();
        handler = new Handler();
        textView = findViewById(R.id.welcome_message);
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                updateUi();
            }
        }.start();
    }

    public void updateUi() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                textView.setText("Hello Chanse");
            }
        };
//        runOnUiThread(runnable);
        runOnUi(runnable);
    }

    private void runOnUi(Runnable runnable) {
        if (Thread.currentThread() == uiThread) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
