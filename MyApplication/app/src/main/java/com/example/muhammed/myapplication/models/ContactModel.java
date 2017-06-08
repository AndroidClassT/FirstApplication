package com.example.muhammed.myapplication.models;

/**
 * Created by Muhammed on 08/06/17.
 */

public class ContactModel {

    private String userName = "";
    private String number = "";
    private String email = "";


    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
