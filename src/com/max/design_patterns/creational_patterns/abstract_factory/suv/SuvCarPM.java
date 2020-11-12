package com.max.design_patterns.creational_patterns.abstract_factory.suv;

import com.max.design_patterns.creational_patterns.abstract_factory.ProjectManager;

public class SuvCarPM implements ProjectManager {
    @Override
    public void managesCar() {
        System.out.println("Suv car Project Manager manages suv project...");
    }
}
