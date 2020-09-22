package com.example.daggerinjavaprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.daggerinjavaprac.application.MyApplication;
import com.example.daggerinjavaprac.di.components.DaggerActivityComponent;
import com.example.daggerinjavaprac.di.modules.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    public MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent
                .builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MyApplication)getApplication()).component)
                .build()
                .inject(this);
        Log.i("MainActivity",mainViewModel.toString());
    }
}