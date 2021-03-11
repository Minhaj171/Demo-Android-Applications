package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class SignupForm extends AppCompatActivity {
    //define attributes
    private TextInputLayout textInputName;
    private TextInputLayout textInputFullname;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputpassword;
    private TextInputLayout textInputConpassword;
    private RadioGroup radioGroup;
    private RadioButton GenderBtn;
    private Button confirmBtn;


        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        //store id in a veriable from XMLactivity
        textInputName = findViewById(R.id.input_name);
        textInputFullname = findViewById(R.id.input_full_name);
        textInputEmail = findViewById(R.id.input_email);
        textInputpassword = findViewById(R.id.input_password);
        textInputConpassword = findViewById(R.id.input_Con_password);
        radioGroup = (RadioGroup) findViewById(R.id.rbGroup);
        confirmBtn = (Button) findViewById(R.id.btnsubmit);
            confirmBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    confirminput(v);
//                         int selectedid = radioGroup.getCheckedRadioButtonId();
//                         GenderBtn = (RadioButton) findViewById(selectedid);
//                          String value = GenderBtn.getText().toString();
//                          if (value.isEmpty()){
//                              validation();
//                          }else{
//                              GenderBtn.setError("null");
//                              return;
//                          }
                    if(radioGroup.getCheckedRadioButtonId()==-1)
                    {
                        Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        // get selected radio button from radioGroup
                        int selectedId = radioGroup.getCheckedRadioButtonId();
                        // find the radiobutton by returned id
                        GenderBtn = (RadioButton)findViewById(selectedId);
                        Toast.makeText(getApplicationContext(), GenderBtn.getText().toString()+" is selected", Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }

        //validation for nameInput
        private boolean validateusername () {
        String usernameInput = textInputName.getEditText().getText().toString().trim();

        if (usernameInput.isEmpty()) {
            textInputName.setError("Field can't empty");
            return false;
        } else if (usernameInput.length() > 15) {
            textInputName.setError("Name is too long");
            return false;
        } else {
            textInputName.setError(null);
            return true;
        }
    }
        //validation for fullName
        private boolean validateConusername () {
        String userConameInput = textInputFullname.getEditText().getText().toString().trim();

        if (userConameInput.isEmpty()) {
            textInputFullname.setError("Field can't empty");
            return false;
        } else if (userConameInput.length() > 15) {
            textInputFullname.setError("Fullname is too long");
            return false;
        } else {
            textInputFullname.setError(null);
            return true;
        }
    }

        //validation for email
        private boolean validateEmail () {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()) {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else {
            textInputEmail.setError(null);
            return true;
        }
    }
        //validation for password
        private boolean validatePassword () {
        String passwordInput = textInputpassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()) {
            textInputpassword.setError("Field can't be empty");
            return false;
        } else {
            textInputpassword.setError(null);
            return true;
        }

    }
        //validation for confirm password
        private boolean validateCoPassword () {
        String passwordCoInput = textInputConpassword.getEditText().getText().toString().trim();
        String MPassword = textInputpassword.getEditText().getText().toString().trim();
        if (passwordCoInput.isEmpty()) {
            textInputConpassword.setError("Field can't be empty");
            return false;
        } else {
            textInputConpassword.setError(null);
            return true;
        }

    }
    //this is radioButton validation
   /* public void validation(){
    int isSelected = radioGroup.getCheckedRadioButtonId();
     if (isSelected ==-1){
         Toast.makeText(SignupForm.this,"you are not selected any of the gender",Toast.LENGTH_SHORT).show();
         return;
     }
    }*/


        //button method implemantation
        public void confirminput (View view){
        if (!validateusername() | validateConusername() | validateEmail() | validatePassword() | validateCoPassword()) {
            return;
        }
    }
}