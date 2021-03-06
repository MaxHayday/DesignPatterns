package com.max.design_patterns.creational_patterns.singleton;

public class SomeCar {
    public static void main(String[] args) {
        CarSystemLogger.getCarSystemLogger().addCarSystemLogger("Brakes system log...");
        CarSystemLogger.getCarSystemLogger().addCarSystemLogger("Airbag system log...");
        CarSystemLogger.getCarSystemLogger().addCarSystemLogger("Oil level system log...");
        CarSystemLogger.getCarSystemLogger().showCarSystemLogger();
    }
}
