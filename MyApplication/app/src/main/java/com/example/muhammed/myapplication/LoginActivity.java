package com.example.muhammed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton = null;
    private EditText userEditText = null;
    private EditText passwordEditText = null;
    private Button registerButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userEditText = (EditText) findViewById(R.id.usernameedittext);
        passwordEditText = (EditText) findViewById(R.id.passwordeditText);
        loginButton = (Button) findViewById(R.id.loginbutton);
        registerButton = (Button) findViewById(R.id.registerButton);


        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginbutton:
                if (userEditText.getText().toString().equalsIgnoreCase("musthafa") && passwordEditText.getText().toString().equals("musthu")) {
                    gotoActivity();
                } else {
                    Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.registerButton :
                Intent intent = new Intent(this, RegistrationActivity.class);
                startActivity(intent);
                break;
        }


    }

    private void gotoActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
