package com.example.daggerinjavaprac.data;

import android.content.Context;

import com.example.daggerinjavaprac.di.qualifier.NetworkScope;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DatabaseService {
    String dbname;
    int dbversion;
    Context context;
    @Inject
    public DatabaseService(Context context, @NetworkScope String dbname, int dbversion){
        this.context=context;
        this.dbname=dbname;
        this.dbversion=dbversion;
    }
}
