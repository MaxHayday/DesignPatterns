package com.max.design_patterns.creational_patterns.factory;

public class IphonePhoneFactory implements PhoneFactory{
    @Override
    public Phone createOperationSystem() {
        return new Iphone();
    }
}
