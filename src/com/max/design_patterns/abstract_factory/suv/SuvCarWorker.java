package com.max.design_patterns.abstract_factory.suv;

import com.max.design_patterns.abstract_factory.Worker;

public class SuvCarWorker implements Worker {
    @Override
    public void makeCar() {
        System.out.println("Worker builds suv car...");
    }
}
