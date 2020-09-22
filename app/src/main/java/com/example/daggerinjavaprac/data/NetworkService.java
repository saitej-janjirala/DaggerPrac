package com.example.daggerinjavaprac.data;

import android.content.Context;

public class NetworkService {
    Context context;
    String apikey;

    public NetworkService(Context context, String apikey) {
        this.context = context;
        this.apikey = apikey;
    }
}
