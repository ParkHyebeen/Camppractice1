package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //무조건 만들어져있어야 하지
        setContentView(R.layout.activity_main); //무조건 만들어져있어야 하지
    }
}