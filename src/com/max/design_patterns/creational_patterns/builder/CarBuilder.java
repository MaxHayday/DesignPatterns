package com.max.design_patterns.creational_patterns.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }
    abstract void buildName();
    abstract void buildTypeOfEngine();
    abstract void buildPrice();
    Car getCar(){
        return car;
    }
}
