package com.apple.testmudule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apple.mylibrary.TestPrint;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TestPrint().toast(this,"kdkkd");
    }
}
