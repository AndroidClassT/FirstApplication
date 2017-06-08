package com.example.muhammed.myapplication.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.muhammed.myapplication.R;
import com.example.muhammed.myapplication.adapters.ContactAdapter;
import com.example.muhammed.myapplication.models.ContactModel;

import java.util.ArrayList;

/**
 * Created by Muhammed on 08/06/17.
 */

public class ListviewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListViewCompat mListViewCompat = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_activity);

        setUI();
    }

    private void setUI() {
        mListViewCompat = (ListViewCompat) findViewById(R.id.listView);

        ArrayList<ContactModel> contactModels = getConactList();
        ContactAdapter contactAdapter = new ContactAdapter(this, contactModels);

        mListViewCompat.setAdapter(contactAdapter);

        mListViewCompat.setOnItemClickListener(this);

    }

    private ArrayList<ContactModel> getConactList() {
        ArrayList<ContactModel> contactModels = new ArrayList<>();


//        Creating contacts
        ContactModel contactOne = new ContactModel();

        contactOne.setUserName("Muhammed");
        contactOne.setNumber("9446771927");
        contactOne.setEmail("muhammed@gmail.com");

//        Adding contact
        contactModels.add(contactOne);


//        Creating contacts

        ContactModel contactTwo = new ContactModel();
        contactTwo.setUserName("Musthafa");
        contactTwo.setNumber("1234567890");
        contactTwo.setEmail("musthafa@gmail.com");

//        Adding contacts

        contactModels.add(contactTwo);


        return contactModels;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ContactModel contactModel = (ContactModel) parent.getItemAtPosition(position);

        Toast.makeText(this, "User : " + contactModel.getUserName(), Toast.LENGTH_SHORT).show();
    }
}
