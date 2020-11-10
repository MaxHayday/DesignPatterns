package com.max.design_patterns.factory;

public class LinuxPhoneFactory implements PhoneFactory {
    @Override
    public Phone createOperationSystem() {
        return new LinuxPhone();
    }
}
