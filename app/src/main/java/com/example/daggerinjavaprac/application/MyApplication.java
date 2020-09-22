package com.example.daggerinjavaprac.application;


import android.app.Application;
import android.util.Log;

import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;
import com.example.daggerinjavaprac.di.components.ApplicationComponent;
import com.example.daggerinjavaprac.di.components.DaggerApplicationComponent;
import com.example.daggerinjavaprac.di.modules.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {
    public ApplicationComponent component;
    @Inject
    DatabaseService databaseService;
    @Inject
    NetworkService networkService;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);
        Log.i("Application", networkService.toString());
        Log.i("Application", databaseService.toString());
    }
}
