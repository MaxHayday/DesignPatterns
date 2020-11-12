package com.max.design_patterns.creational_patterns.builder;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildTypeOfEngine();
        carBuilder.buildPrice();
        Car car = carBuilder.getCar();
        return car;
    }
}
