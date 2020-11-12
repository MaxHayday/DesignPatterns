package com.max.design_patterns.builder;

public class Car {
    private String name;
    private TypeOfEngine typeOfEngine;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", typeOfEngine=" + typeOfEngine +
                ", price=" + price +
                '}';
    }
}
