package com.example.daggerinjavaprac.data;

import android.content.Context;

public class DatabaseService {
    String dbname;
    int dbversion;
    Context context;
    public DatabaseService(Context context,String dbname, int dbversion){
        this.context=context;
        this.dbname=dbname;
        this.dbversion=dbversion;
    }
}
