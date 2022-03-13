package com.example.daggerhiltjava;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
@ActivityScoped
public class Musician {
 private Insrument instrument;
 private Band band;
//Constructor injection
    @Inject
    public Musician(Insrument instrument, Band band) {
        this.instrument = instrument;
        this.band = band;
    }

    public void sing(){

        System.out.println("wolking");
    }
}
