package com.max.design_patterns.structural_patterns.facad;

public class Workflow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Worker worker = new Worker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        worker.doJobBeforeDedline(bugTracker);
    }

}
