package com.example.daggerinjavaprac.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface DatabaseScope {
}
