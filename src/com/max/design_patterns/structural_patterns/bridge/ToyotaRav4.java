package com.max.design_patterns.structural_patterns.bridge;

public class ToyotaRav4 extends Car{
    public ToyotaRav4(Worker worker) {
        super(worker);
    }

    @Override
    public void buildCar() {
        System.out.println("Toyota Rav 4 in progress...");
        worker.createCar();
    }
}
