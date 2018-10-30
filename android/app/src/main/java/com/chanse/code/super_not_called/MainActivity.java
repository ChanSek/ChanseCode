package com.chanse.code.super_not_called;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.chanse.code.test.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
