package com.max.design_patterns.structural_patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        workers.remove(worker);
    }

    public void buildCar() {
        System.out.println("Team builds car...\n");
        for (Worker worker :
                workers) {
            worker.createCar();
        }
    }
}
