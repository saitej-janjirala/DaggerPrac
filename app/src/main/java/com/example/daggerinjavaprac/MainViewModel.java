package com.example.daggerinjavaprac;

import android.provider.ContactsContract;

import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;
import com.example.daggerinjavaprac.di.scope.ActivityScope;

import javax.inject.Inject;

public class MainViewModel {
    DatabaseService databaseService;
    NetworkService networkService;
    @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService){
        this.databaseService=databaseService;
        this.networkService=networkService;
    }
}
