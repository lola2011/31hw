package com.company;

public class BlackBoard extends AbstractBoard implements Writable{
    public BlackBoard(double size, double weight) {
        super(size, weight);
    }

    @Override
    public void write() {
        System.out.println("Write with the chalk!!!");
    }
}

