package com.max.design_patterns.creational_patterns.abstract_factory.van;

import com.max.design_patterns.creational_patterns.abstract_factory.ProjectManager;

public class VanCarPM implements ProjectManager {
    @Override
    public void managesCar() {
        System.out.println("Van PM manages van car...");
    }
}
