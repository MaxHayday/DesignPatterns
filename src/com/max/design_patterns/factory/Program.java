package com.max.design_patterns.factory;

public class Program {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = createOperationSystemByTypeOfPhone("linux");
        Phone phone = phoneFactory.createOperationSystem();
        phone.writeNameOfOperationSystem();
    }

    static PhoneFactory createOperationSystemByTypeOfPhone(String typeOfPhone) {
        if (typeOfPhone.equalsIgnoreCase("android")) {
            return new AndroidPhoneFactory();
        } else if (typeOfPhone.equalsIgnoreCase("ios")) {
            return new IphonePhoneFactory();
        } else if (typeOfPhone.equalsIgnoreCase("linux")) {
            return new LinuxPhoneFactory();
        } else {
            throw new RuntimeException(typeOfPhone + " is unknown type of phone.");
        }
    }
}
