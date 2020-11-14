package com.max.design_patterns.structural_patterns.decorator;

public class CarChassisWorker implements Worker {
    @Override
    public String makeJob() {
        return "Build chassis of car";
    }
}
