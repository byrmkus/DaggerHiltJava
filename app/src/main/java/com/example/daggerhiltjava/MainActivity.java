package com.example.daggerhiltjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    //Field injection
    @Inject
    Musician lars;

    @Inject
    ClassExample classExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lars.sing();

        System.out.println(classExample.myFunction());
        System.out.println(classExample.secondFunction());
    }
}
