package com.apple.testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.apple.mylibrary.TestPrint;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TestPrint().toast(this,"哈哈哈");
    }
}
