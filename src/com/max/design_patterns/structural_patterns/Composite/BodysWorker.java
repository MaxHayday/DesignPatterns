package com.max.design_patterns.structural_patterns.Composite;

public class BodysWorker implements Worker {
    @Override
    public void createCar() {
        System.out.println("Body worker builds bodys of car...");
    }
}
