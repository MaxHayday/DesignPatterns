package com.max.design_patterns.factory;

public class LinuxPhone implements Phone{
    @Override
    public void writeNameOfOperationSystem() {
        System.out.println("I am Linux");
    }
}
