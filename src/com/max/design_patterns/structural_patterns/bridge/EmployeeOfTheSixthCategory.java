package com.max.design_patterns.structural_patterns.bridge;

public class EmployeeOfTheSixthCategory implements Worker {
    @Override
    public void createCar() {
        System.out.println("Employee of the sixth category creates car...");
    }
}
