package com.max.design_patterns.creational_patterns.factory;

public class Android implements Phone {

    @Override
    public void writeNameOfOperationSystem() {
        System.out.println("I am Android");
    }
}
