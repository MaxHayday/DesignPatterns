package com.max.design_patterns.structural_patterns.bridge;

public abstract class Car {
    protected Worker worker;

    public Car(Worker worker) {
        this.worker = worker;
    }
    public abstract void buildCar();
}
