package com.max.design_patterns.abstract_factory.van;

import com.max.design_patterns.abstract_factory.Tester;

public class VanCarTester implements Tester {
    @Override
    public void testCar() {
        System.out.println("Van tester tests van car...");
    }
}
