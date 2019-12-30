package com.company;

abstract class AbstractBoard {
    private double size;
    private double weight;

    public AbstractBoard(double size, double weight) {
        this.size = size;
        this.weight= weight;
    }
    public AbstractBoard(){

    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }
}
