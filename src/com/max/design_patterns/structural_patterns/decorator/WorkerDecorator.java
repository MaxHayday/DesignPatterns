package com.max.design_patterns.structural_patterns.decorator;

public class WorkerDecorator implements Worker {
Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String makeJob() {
        return worker.makeJob();
    }
}
