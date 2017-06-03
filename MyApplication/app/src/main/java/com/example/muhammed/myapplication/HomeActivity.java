package com.example.muhammed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private TextView udnametextView= null;
    private TextView udemailtextView= null;
    private TextView udusernametextView= null;
    private TextView udpasswordtextView= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        udnametextView = (TextView)findViewById(R.id.udnametextView);
        udemailtextView = (TextView)findViewById(R.id.udemailtextView);
        udusernametextView = (TextView)findViewById(R.id.udusernametextView);
        udpasswordtextView = (TextView)findViewById(R.id.udpasswordtextView);

        Intent intent = getIntent();
        String name = intent.getStringExtra(RegistrationActivity.U_NAME);
        String email = intent.getStringExtra(RegistrationActivity.U_EMAIL);
        String registerusername = intent.getStringExtra(RegistrationActivity.U_REGISTERUSERNAME);
        String registerpassword = intent.getStringExtra(RegistrationActivity.U_REGISTERPASSWORD);
        udnametextView.setText(name);
        udemailtextView.setText(email);
        udusernametextView.setText(registerusername);
        udpasswordtextView.setText(registerpassword);


        // Toast.makeText(this,"USER DETAILS\n" + "Name:" + name +"\n"  + "Email ID:" + email +"\n" + "UserName:" + registerusername + "\n" + "Password:" + registerpassword  , Toast.LENGTH_LONG).show();

    }
}
