package com.max.design_patterns.abstract_factory.suv;

import com.max.design_patterns.abstract_factory.ProjectManager;
import com.max.design_patterns.abstract_factory.ProjectTeamFactory;
import com.max.design_patterns.abstract_factory.Tester;
import com.max.design_patterns.abstract_factory.Worker;

public class SuvCarTeamFactory implements ProjectTeamFactory {
    @Override
    public Worker getWorker() {
        return new SuvCarWorker();
    }

    @Override
    public Tester getTester() {
        return new SuvCarTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new SuvCarPM();
    }
}
