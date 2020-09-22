package com.example.daggerinjavaprac.di.components;

import com.example.daggerinjavaprac.MainActivity;
import com.example.daggerinjavaprac.di.modules.ActivityModule;
import com.example.daggerinjavaprac.di.modules.ApplicationModule;
import com.example.daggerinjavaprac.di.scope.ActivityScope;


import dagger.Component;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class},modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
