package com.max.design_patterns.creational_patterns.builder;

public class ToyotaRavFourCarBuilder extends CarBuilder {

    @Override
    void buildName() {
        car.setName("Toyota Rav4");
    }

    @Override
    void buildTypeOfEngine() {
        car.setTypeOfEngine(TypeOfEngine.Hibrid);
    }

    @Override
    void buildPrice() {
        car.setPrice(70000);
    }
}
