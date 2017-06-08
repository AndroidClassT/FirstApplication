package com.example.muhammed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.muhammed.myapplication.list.ListviewActivity;
import com.example.muhammed.myapplication.storage.AppStorageFactory;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton = null;
    private EditText userEditText = null;
    private EditText passwordEditText = null;
    private Button registerButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppStorageFactory.isUserLogged(this)) {
            gotoActivity();

        }


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

                String username = AppStorageFactory.getUsername(this);
                String password = AppStorageFactory.getPassword(this);

                if (userEditText.getText().toString().equals(username) && passwordEditText.getText().toString().equals(password)) {
                    gotoActivity();
                } else {
                    Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.registerButton:
                Intent intent = new Intent(this, RegistrationActivity.class);
                startActivity(intent);
                finish();
                break;
        }


    }

    private void gotoActivity() {
        Intent intent = new Intent(this, ListviewActivity.class);
        startActivity(intent);
        finish();
    }
}
