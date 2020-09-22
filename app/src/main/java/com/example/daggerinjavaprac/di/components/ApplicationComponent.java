package com.example.daggerinjavaprac.di.components;

import com.example.daggerinjavaprac.application.MyApplication;
import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;
import com.example.daggerinjavaprac.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MyApplication application);
    DatabaseService providesDatabaseService();
    NetworkService providesNetworkService();
}
