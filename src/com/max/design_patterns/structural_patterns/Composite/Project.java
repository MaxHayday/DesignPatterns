package com.max.design_patterns.structural_patterns.Composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Worker firstchassiCarWorker = new ChassisWorker();
        Worker secondchassiCarWorker = new ChassisWorker();
        Worker bodyCarWorker = new BodysWorker();

        team.addWorker(firstchassiCarWorker);
        team.addWorker(secondchassiCarWorker);
        team.addWorker(bodyCarWorker);

        team.buildCar();
    }
}
