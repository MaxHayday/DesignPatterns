package com.max.design_patterns.creational_patterns.abstract_factory.suv;

import com.max.design_patterns.creational_patterns.abstract_factory.Tester;

public class SuvCarTester implements Tester {
    @Override
    public void testCar() {
        System.out.println("Tester tests suv car...");
    }
}
