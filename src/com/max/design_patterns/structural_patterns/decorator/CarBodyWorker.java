package com.max.design_patterns.structural_patterns.decorator;

public class CarBodyWorker extends WorkerDecorator {
    public CarBodyWorker(Worker worker) {
        super(worker);
    }

    public String buildBody() {
        return " Make car body";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + buildBody();
    }
}
