package com.example.muhammed.myapplication.storage;

import android.content.Context;


/**
 * Created by Muhammed on 04/06/17.
 */

public class AppStorageFactory {
    private static final String USER_NAME = "username";
    private static final String NAME = "name";
    private static final String EMAIl = "email";
    private static final String PASSWORD = "password";
    private static final String IS_USER_LOGGED = "is_user_logged";

    public static void insertUsername(String username, Context context) {
        AppStorage.insertString(USER_NAME, username, context);

    }

    public static void insertName(String name, Context context) {
        AppStorage.insertString(NAME, name, context);
    }

    public static void insertEmail(String email, Context context) {
        AppStorage.insertString(EMAIl, email, context);
    }

    public static void insertPassword(String password, Context context) {
        AppStorage.insertString(PASSWORD, password, context);
    }

    public static void setUserLogged(boolean isUserLogged, Context context) {
        AppStorage.insertBoolean(IS_USER_LOGGED, isUserLogged, context);
    }

    public static boolean isUserLogged(Context context) {
        return AppStorage.getBoolean(IS_USER_LOGGED, context);
    }

    public static String getUsername(Context context) {
        return AppStorage.getString(USER_NAME, context);
    }

    public static String getName(Context context) {
        return AppStorage.getString(NAME, context);
    }

    public static String getEmail(Context context) {
        return AppStorage.getString(EMAIl, context);
    }

    public static String getPassword(Context context) {
        return AppStorage.getString(PASSWORD, context);
    }

    public static void clearAll(Context context) {
        AppStorage.clearAll(context);
    }
}
