package com.example.android.moviedbapplication.root;

import android.app.Application;

public class MoviesApplication extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent =
                DaggerApplicationComponent.builder()
                .applicationContext(this)
                .build();
    }

    public ApplicationComponent getComponent() {
        return mComponent;
    }
}
