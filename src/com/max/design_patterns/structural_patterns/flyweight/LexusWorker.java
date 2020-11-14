package com.max.design_patterns.structural_patterns.flyweight;

public class LexusWorker implements Worker {
    @Override
    public void buildCar() {
        System.out.println("Lexus worker builds Lexus car...");
    }
}
