package com.max.design_patterns.creational_patterns.abstract_factory.van;

import com.max.design_patterns.creational_patterns.abstract_factory.ProjectManager;
import com.max.design_patterns.creational_patterns.abstract_factory.ProjectTeamFactory;
import com.max.design_patterns.creational_patterns.abstract_factory.Tester;
import com.max.design_patterns.creational_patterns.abstract_factory.Worker;

public class VanCarTeamFactory implements ProjectTeamFactory {
    @Override
    public Worker getWorker() {
        return new VanCarWorker();
    }

    @Override
    public Tester getTester() {
        return new VanCarTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new VanCarPM();
    }
}
