package com.example.daggerhiltjava;

import javax.inject.Inject;

public class InterfaceImplementor implements MyInterface {
    @Inject
    public InterfaceImplementor() {
    }

    @Override
    public String myPrintFunction() {
        return "MyInterface Implementor";
    }
}
