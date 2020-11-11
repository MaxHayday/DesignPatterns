package com.max.design_patterns.abstract_factory;

import com.max.design_patterns.abstract_factory.suv.SuvCarTeamFactory;

public class BMWSuvProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new SuvCarTeamFactory();
        Worker worker = projectTeamFactory.getWorker();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Start build BMW Suv car...");
        worker.makeCar();
        tester.testCar();
        projectManager.managesCar();
    }
}
