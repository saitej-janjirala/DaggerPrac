package com.example.daggerinjavaprac;

import android.provider.ContactsContract;

import com.example.daggerinjavaprac.data.DatabaseService;
import com.example.daggerinjavaprac.data.NetworkService;

public class MainViewModel {
    DatabaseService databaseService;
    NetworkService networkService;
    public MainViewModel(DatabaseService databaseService, NetworkService networkService){
        this.databaseService=databaseService;
        this.networkService=networkService;
    }
}
