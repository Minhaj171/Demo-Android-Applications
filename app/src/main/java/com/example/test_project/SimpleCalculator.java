package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleCalculator extends AppCompatActivity {
    private TextView textView, resultTextView;
    private EditText editText1, editText2;
    private Button AddButton, SubButton, DivButton, MultiplyButton, DeleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        textView = findViewById(R.id.CalTextView);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        AddButton = (Button) findViewById(R.id.button1);
        SubButton = (Button) findViewById(R.id.button2);
        DivButton = (Button) findViewById(R.id.button3);
        MultiplyButton = (Button) findViewById(R.id.button4);
        DeleteButton = (Button) findViewById(R.id.button5);
        resultTextView = findViewById(R.id.showTextview);

        Handler handler = new Handler();

        AddButton.setOnClickListener(handler);
        SubButton.setOnClickListener(handler);
        DivButton.setOnClickListener(handler);
        MultiplyButton.setOnClickListener(handler);
        DeleteButton.setOnClickListener(handler);


    }

    public class Handler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
           try {
               String num1 = editText1.getText().toString();
               String num2 = editText2.getText().toString();

               Double N1 = Double.parseDouble(num1);
               Double N2 = Double.parseDouble(num2);

               if (v.getId() == R.id.button1) {
                   Double sum = N1 + N2;
                   resultTextView.setText("Added two number: " + sum);
                   //validation();
                   //Toast.makeText(getApplicationContext(),"adding two number" + sum,Toast.LENGTH_SHORT).show();
               } else if (v.getId() == R.id.button2) {
                   Double sub = N1 - N2;
                   resultTextView.setText("Added two number: " + sub);
                   //Toast.makeText(getApplicationContext(),"adding two number" + sum,Toast.LENGTH_SHORT).show();
               } else if (v.getId() == R.id.button3) {
                   Double divide = N1 / N2;
                   resultTextView.setText("Added two number: " + divide);
                   //Toast.makeText(getApplicationContext(),"adding two number" + sum,Toast.LENGTH_SHORT).show();
               } else if (v.getId() == R.id.button4) {
                   Double multiply = N1 * N2;
                   resultTextView.setText("Added two number: " + multiply);
                   //Toast.makeText(getApplicationContext(),"adding two number" + sum,Toast.LENGTH_SHORT).show();
               } else if (v.getId() == R.id.button5) {
                   editText1.setText("");
                   editText2.setText("");
                   resultTextView.setText("");
                   //Toast.makeText(getApplicationContext(),"adding two number" + sub,Toast.LENGTH_SHORT).show();
               }
           }catch (Exception e){
               Toast.makeText(SimpleCalculator.this,"Please Enter number",Toast.LENGTH_SHORT).show();
           }
        }
    }

// trying validation
//    private boolean validation() {
//        String userInput1 = editText1.getEditableText().toString().trim();
//        String userInput2 = editText2.getEditableText().toString().trim();
//
//        if (userInput1.isEmpty() || userInput2.isEmpty()) {
//            Toast.makeText(getApplicationContext(), "please input number", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        else{
//            editText1.setError("Field can't be empty");
//            return false;
//        }
//    }
}