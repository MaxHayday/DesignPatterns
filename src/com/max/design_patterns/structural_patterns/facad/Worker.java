package com.max.design_patterns.structural_patterns.facad;

public class Worker {
    public void doJobBeforeDedline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Worker is solving problems...");
        }else {
            System.out.println("Worker is reading instruction...");
        }
    }
}
