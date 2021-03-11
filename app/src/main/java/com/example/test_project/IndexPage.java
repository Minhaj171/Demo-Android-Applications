package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IndexPage extends AppCompatActivity implements View.OnClickListener {
        private TextView textView;
        private Button buttonlogin, buttonsignup, buttonCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        getSupportActionBar().hide();

        textView = findViewById(R.id.textviewId);
        buttonlogin = findViewById(R.id.loginbuttonID);
        buttonsignup =findViewById(R.id.signUPbutton);
        buttonCalc = findViewById(R.id.CalCbutton);

        buttonlogin.setOnClickListener(this);
        buttonsignup.setOnClickListener(this);
        buttonCalc.setOnClickListener(this);
    }

    @Override
    //execute intent
    public void onClick(View v) {
        if(v.getId() ==  R.id.loginbuttonID){
            Intent intent = new Intent(IndexPage.this,LoginForm.class);
            startActivity(intent);
        }
        else if(v.getId() ==  R.id.signUPbutton){
            Intent intent = new Intent(IndexPage.this,SignupForm.class);
            startActivity(intent);
        }
        else if(v.getId() ==  R.id.CalCbutton){
            Intent intent = new Intent(IndexPage.this,SimpleCalculator.class);
            startActivity(intent);
        }
    }
}