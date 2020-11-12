package com.max.design_patterns.structural_patterns.adapter;

public class Delivery {
    public static void main(String[] args) {
        Store store = new Manager();

        store.add();
        store.update();
        store.select();
        store.remove();
    }
}
