package com.example.daggerinjavaprac.di.modules;

import android.app.Activity;
import android.content.Context;


import com.example.daggerinjavaprac.MainViewModel;
import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;
import com.example.daggerinjavaprac.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    Activity activity;
    public ActivityModule(Activity activity){
        this.activity=activity;
    }
//    @ActivityScope
//    @Provides
//    MainViewModel providesMainViewModel(DatabaseService databaseService,NetworkService networkService){
//      return new MainViewModel(databaseService,networkService);
//    }
    //removed after injecting mainviewmodel constructor
    @Provides
    Context providesContext(){
        return activity;
    }
}
