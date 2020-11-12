package com.max.design_patterns.creational_patterns.abstract_factory;

import com.max.design_patterns.creational_patterns.abstract_factory.van.VanCarTeamFactory;

public class BMWVanProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new VanCarTeamFactory();
        Worker worker = projectTeamFactory.getWorker();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Start build BMW Van car...");
        worker.makeCar();
        tester.testCar();
        projectManager.managesCar();
    }
}
