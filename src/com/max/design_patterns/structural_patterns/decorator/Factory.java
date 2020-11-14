package com.max.design_patterns.structural_patterns.decorator;

public class Factory {
    public static void main(String[] args) {
        Worker worker = new CarTeamLead(new CarBodyWorker(new CarChassisWorker()));
        System.out.println(worker.makeJob());
    }
}
