package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "I was resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "I was started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "I was stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "I was destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "mainactivitycreated");
    }
}