package com.max.design_patterns.creational_patterns.abstract_factory;

public interface ProjectTeamFactory {
    Worker getWorker();
    Tester getTester();
    ProjectManager getProjectManager();
}
