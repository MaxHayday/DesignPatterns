package com.max.design_patterns.creational_patterns.builder;

public class ToyotaPriusCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Toyota Prius");
    }

    @Override
    void buildTypeOfEngine() {
        car.setTypeOfEngine(TypeOfEngine.GAZ);
    }

    @Override
    void buildPrice() {
        car.setPrice(50000);
    }
}
