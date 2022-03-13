package com.example.daggerhiltjava;


import com.google.gson.Gson;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public class MyModule {

    @FirstImplemantation
    @Singleton
    @Provides
    public MyInterface providerFunction() {
        return new InterfaceImplementor();
    }

    @Singleton
    @Provides
    public Gson gSonProvider() {
        return new Gson();
    }

    @SecontImplemantation
    @Singleton
    @Provides
    public MyInterface secondProviderFunction() {
        return new SecondInterfaceImplemantor();
    }
}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface FirstImplemantation {
}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface SecontImplemantation {
}

