package com.max.design_patterns.structural_patterns.bridge;

public class EmployeeOfTheFourthCategory implements Worker {
    @Override
    public void createCar() {
        System.out.println("Employee of the fourth category creates car...");
    }
}
