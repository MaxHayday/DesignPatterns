package com.max.design_patterns.structural_patterns.bridge;


public class Factory {
    public static void main(String[] args) {
        Car[] cars = {
                new ToyotaPrius(new EmployeeOfTheFourthCategory()),
                new ToyotaRav4(new EmployeeOfTheSixthCategory())
        };

        for (Car car : cars
        ) {
            car.buildCar();
        }
    }
}
