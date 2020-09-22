package com.example.daggerinjavaprac.di.modules;

import android.app.Application;
import android.content.Context;
import android.provider.ContactsContract;

import com.example.daggerinjavaprac.application.MyApplication;
import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;
import com.example.daggerinjavaprac.di.qualifier.DatabaseScope;
import com.example.daggerinjavaprac.di.qualifier.NetworkScope;

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
//    @Singleton
//    @Provides
//    DatabaseService providesDatabaseService(){
//        return  new DatabaseService(application.getApplicationContext(),"saiteja",1);
//    }
//    @Singleton
//    @Provides
//    NetworkService providesNetworkService(){
//        return new NetworkService(application.getApplicationContext(),"saitej");
//    }
    //removed after injecting both the constructors
    @Provides
    Context providesContext(){
        return application;
    }

    @DatabaseScope
    @Provides
    String providesdbName(){
        return "saiteja";
    }

    @Provides
    Integer providesDatabaseVersion(){
        return 1;
    }

    @NetworkScope
    @Provides
    String providesApiKey(){
        return "saitej.api.key";
    }
}
