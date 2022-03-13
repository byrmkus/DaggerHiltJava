package com.example.daggerhiltjava;

import com.google.gson.Gson;

import javax.inject.Inject;

public class ClassExample {
    private MyInterface myInterfaceImlemantation;

    private MyInterface secondInterfaceImplemantation;

    @Inject
    public ClassExample(@FirstImplemantation MyInterface myInterface, Gson gson, @SecontImplemantation MyInterface mySecondInterfaceImplementor) {
        this.myInterfaceImlemantation = myInterface;
        this.secondInterfaceImplemantation = mySecondInterfaceImplementor;
    }

    public String myFunction() {
        return "Working " + myInterfaceImlemantation.myPrintFunction() + "";
    }

    public String secondFunction() {
        return "Working " + secondInterfaceImplemantation.myPrintFunction() + "";
    }
}
