package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class DashBoard extends AppCompatActivity implements View.OnClickListener {
    private CardView calulator,Library,Shopping,registration,admin,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        calulator = findViewById(R.id.CalcardView);
        Library = findViewById(R.id.librarycardView);
        Shopping = findViewById(R.id.shoppingcardView);
        registration = findViewById(R.id.RegCardView);
        admin = findViewById(R.id.adminpanelCardView);
        login = findViewById(R.id.LoginIDCardView);

        calulator.setOnClickListener(this);
        Library.setOnClickListener(this);
        Shopping.setOnClickListener(this);
        registration.setOnClickListener(this);
        admin.setOnClickListener(this);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.CalcardView){
            Intent intent = new Intent(DashBoard.this,SimpleCalculator.class);
            startActivity(intent);
        }
//        if(v.getId() == R.id.librarycardView){
//            Intent intent = new Intent(DashBoard.this,library.class);
//            startActivity(intent);
////        }
//        else if(v.getId() == R.id.shoppingcardView){
//            Intent intent = new Intent(DashBoard.this,SimpleCalculator.class);
//            startActivity(intent);
//        }
        else if(v.getId() == R.id.RegCardView){
            Intent intent = new Intent(DashBoard.this,SignupForm.class);
            startActivity(intent);
        }
//        else if(v.getId() == R.id.adminpanelCardView){
//            Intent intent = new Intent(DashBoard.this,SimpleCalculator.class);
//            startActivity(intent);
//        }
        else if(v.getId() == R.id.LoginIDCardView){
            Intent intent = new Intent(DashBoard.this,LoginForm.class);
            startActivity(intent);
        }
    }
}