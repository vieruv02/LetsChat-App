package com.example.vladislav.letschat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Vladislav on 5/27/2016.
 */
public class AppLifeApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
