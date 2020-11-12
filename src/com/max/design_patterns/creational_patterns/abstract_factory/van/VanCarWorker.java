package com.max.design_patterns.creational_patterns.abstract_factory.van;

import com.max.design_patterns.creational_patterns.abstract_factory.Worker;

public class VanCarWorker implements Worker {
    @Override
    public void makeCar() {
        System.out.println("Build van car...");
    }
}
