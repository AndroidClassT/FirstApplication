package com.example.muhammed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String U_NAME = "NAME";
    public static final String U_EMAIL = "EMAIL";
    public static final String U_REGISTERUSERNAME = "REGISTERUSERNAME";
    public static final String U_REGISTERPASSWORD = "REGISTERPASSWORD";
    private Button registerButton =null;
    private EditText registerNameEditText=null;
    private EditText registerEmailEditText=null;
    private EditText registerUsernameEditText=null;
    private EditText registerPasswordEditText=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registerNameEditText= (EditText)findViewById(R.id.registernameeditText);
        registerEmailEditText= (EditText)findViewById(R.id.registeremaileditText);
        registerUsernameEditText= (EditText)findViewById(R.id.registerusernameeditText);
        registerPasswordEditText= (EditText)findViewById(R.id.registerpasswordeditText);
        registerButton= (Button)findViewById(R.id.registerbutton);

        registerButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (registerNameEditText.getText().toString().matches("") || registerEmailEditText.getText().toString().matches("") || registerUsernameEditText.getText().toString().matches("") || registerPasswordEditText.getText().toString().matches("")) {

            Toast.makeText(this, R.string.please_fill_up_your_form, Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(this, R.string.successfully_registered, Toast.LENGTH_SHORT).show();
            gotoActivity();
        }

    }

    private void gotoActivity() {
        Intent intent= new Intent(this, HomeActivity.class);
        intent.putExtra(U_NAME, registerNameEditText.getText().toString());
        intent.putExtra(U_EMAIL, registerEmailEditText.getText().toString());
        intent.putExtra(U_REGISTERUSERNAME, registerUsernameEditText.getText().toString());
        intent.putExtra(U_REGISTERPASSWORD, registerPasswordEditText.getText().toString());

        startActivity(intent);

    }
}