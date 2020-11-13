package com.max.design_patterns.structural_patterns.composite;

public class BodysWorker implements Worker {
    @Override
    public void createCar() {
        System.out.println("Body worker builds bodys of car...");
    }
}
