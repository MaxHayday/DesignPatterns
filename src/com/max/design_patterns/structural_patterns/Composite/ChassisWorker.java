package com.max.design_patterns.structural_patterns.Composite;

public class ChassisWorker implements Worker {
    @Override
    public void createCar() {
        System.out.println("Chassis worker build chassis of car...");
    }
}
