package com.max.design_patterns.creational_patterns.factory;

public class AndroidPhoneFactory implements PhoneFactory{

    @Override
    public Phone createOperationSystem() {
        return new Android();
    }
}
