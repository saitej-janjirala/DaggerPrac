package com.example.daggerinjavaprac.data;

import android.content.Context;

import com.example.daggerinjavaprac.di.qualifier.NetworkScope;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkService {
    Context context;
    String apikey;
    @Inject
    public NetworkService(Context context, @NetworkScope String apikey) {
        this.context = context;
        this.apikey = apikey;
    }
}
