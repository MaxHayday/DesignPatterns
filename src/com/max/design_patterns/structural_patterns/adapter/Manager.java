package com.max.design_patterns.structural_patterns.adapter;

public class Manager extends Shop implements Store {

    @Override
    public void add() {
        addProduct();
    }

    @Override
    public void update() {
        updateProduct();
    }

    @Override
    public void select() {
        selectProduct();
    }

    @Override
    public void remove() {
        removeProduct();
    }
}
