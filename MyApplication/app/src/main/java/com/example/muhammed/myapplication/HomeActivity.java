package com.example.muhammed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.muhammed.myapplication.storage.AppStorage;
import com.example.muhammed.myapplication.storage.AppStorageFactory;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView udnametextView = null;
    private TextView udemailtextView = null;
    private TextView udusernametextView = null;
    private TextView udpasswordtextView = null;
    private Button mLogoutButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        udnametextView = (TextView) findViewById(R.id.udnametextView);
        udemailtextView = (TextView) findViewById(R.id.udemailtextView);
        udusernametextView = (TextView) findViewById(R.id.udusernametextView);
        udpasswordtextView = (TextView) findViewById(R.id.udpasswordtextView);
        mLogoutButton = (Button) findViewById(R.id.logoutbutton);
        mLogoutButton.setOnClickListener(this);

        Intent intent = getIntent();
        String name = AppStorageFactory.getName(this);
        String email = AppStorageFactory.getEmail(this);
        String registerusername = AppStorageFactory.getUsername(this);
        String registerpassword = AppStorageFactory.getPassword(this);
        udnametextView.setText(name);
        udemailtextView.setText(email);
        udusernametextView.setText(registerusername);
        udpasswordtextView.setText(registerpassword);


        // Toast.makeText(this,"USER DETAILS\n" + "Name:" + name +"\n"  + "Email ID:" + email +"\n" + "UserName:" + registerusername + "\n" + "Password:" + registerpassword  , Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
//        AppStorageFactory.clearAll(this);
        AppStorageFactory.setUserLogged(false, this);
        finish();
    }
}
