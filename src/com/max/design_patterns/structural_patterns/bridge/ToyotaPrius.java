package com.max.design_patterns.structural_patterns.bridge;

public class ToyotaPrius extends Car{
    public ToyotaPrius(Worker worker) {
        super(worker);
    }

    @Override
    public void buildCar() {
        System.out.println("Toyota Prius in progress...");
        worker.createCar();
    }
}
