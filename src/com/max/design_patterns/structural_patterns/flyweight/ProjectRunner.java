package com.max.design_patterns.structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();
        List<Worker> workers = new ArrayList<>();

        workers.add(workerFactory.getWorkerByTypeOfCar("toyota"));
        workers.add(workerFactory.getWorkerByTypeOfCar("toyota"));
        workers.add(workerFactory.getWorkerByTypeOfCar("toyota"));
        workers.add(workerFactory.getWorkerByTypeOfCar("toyota"));
        workers.add(workerFactory.getWorkerByTypeOfCar("toyota"));
        workers.add(workerFactory.getWorkerByTypeOfCar("toyota"));
        workers.add(workerFactory.getWorkerByTypeOfCar("lexus"));
        workers.add(workerFactory.getWorkerByTypeOfCar("lexus"));
        workers.add(workerFactory.getWorkerByTypeOfCar("lexus"));
        workers.add(workerFactory.getWorkerByTypeOfCar("lexus"));
        workers.add(workerFactory.getWorkerByTypeOfCar("lexus"));
        workers.add(workerFactory.getWorkerByTypeOfCar("lexus"));

        for (Worker worker :
                workers) {
            worker.buildCar();
        }
    }
}
