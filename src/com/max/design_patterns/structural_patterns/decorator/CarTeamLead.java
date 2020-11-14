package com.max.design_patterns.structural_patterns.decorator;

public class CarTeamLead extends WorkerDecorator {
    public CarTeamLead(Worker worker) {
        super(worker);
    }

    public String sendReport() {
        return " Send report about car";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReport();
    }
}
