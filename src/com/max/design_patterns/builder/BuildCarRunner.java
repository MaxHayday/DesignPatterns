package com.max.design_patterns.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new ToyotaRavFourCarBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
