package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleform);
        getSupportActionBar().hide();
    }
    //executed splash Screen
    int secondsDelayed = 1;
       boolean handler = new Handler().postDelayed(new Runnable() {
        public void run() {
            startActivity(new Intent(MainActivity.this, DashBoard.class));
            finish();
        }
    }, secondsDelayed * 1000);
}
