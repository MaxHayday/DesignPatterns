package com.max.design_patterns.structural_patterns.flyweight;

public class ToyotaWorker implements Worker {
    @Override
    public void buildCar() {
        System.out.println("Toyota worker build Toyota car...");
    }
}
