package com.example.daggerhiltjava;

import javax.inject.Inject;

public class SecondInterfaceImplemantor implements MyInterface{
    @Inject
    public SecondInterfaceImplemantor() {
    }

    @Override
    public String myPrintFunction() {
        return "Second Interface Implemantor";
    }
}
