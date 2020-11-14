package com.max.design_patterns.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> workers = new HashMap<>();

    public Worker getWorkerByTypeOfCar(String speciality) {
        Worker worker = workers.get(speciality);
        if (worker == null) {
            switch (speciality) {
                case "toyota":
                    System.out.println("Hiring Toyota worker...");
                    worker = new ToyotaWorker();
                    break;
                case "lexus":
                    System.out.println("Hiring lexus worker...");
                    worker = new LexusWorker();
                    break;
            }
            workers.put(speciality, worker);
        }
        return worker;
    }
}
