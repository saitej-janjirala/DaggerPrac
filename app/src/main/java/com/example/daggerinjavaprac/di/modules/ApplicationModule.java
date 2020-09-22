package com.example.daggerinjavaprac.di.modules;

import android.app.Application;
import android.provider.ContactsContract;

import com.example.daggerinjavaprac.application.MyApplication;
import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    MyApplication application;
    public ApplicationModule(MyApplication application){
        this.application=application;
    }
    @Singleton
    @Provides
    DatabaseService providesDatabaseService(){
        return  new DatabaseService(application.getApplicationContext(),"saiteja",1);
    }
    @Singleton
    @Provides
    NetworkService providesNetworkService(){
        return new NetworkService(application.getApplicationContext(),"saitej");
    }
}
