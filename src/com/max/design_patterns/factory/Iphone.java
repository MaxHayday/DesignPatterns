package com.max.design_patterns.factory;

public class Iphone implements Phone {
    @Override
    public void writeNameOfOperationSystem() {
        System.out.println("I am IOS");
    }
}
