package com.company;

public class WhiteBoard extends AbstractBoard implements Writable{
    public WhiteBoard(double size, double weight) {
        super(size, weight);
    }

    @Override
    public void write() {
        System.out.println("write with the Black Marker");
    }
}

