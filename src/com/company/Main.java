package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractBoard board=new BlackBoard(2.5, 10.0);
        AbstractBoard board1=new WhiteBoard(3.5,11.2);
	((BlackBoard) board).write();
        ((WhiteBoard) board1).write();
        WhiteBoard board3= new WhiteBoard(4.5,12.9);
        board3.write();


    Monkey monkey1= new Monkey(60,"Chempanze");
    monkey1.carry();
    monkey1.climb();
    Fruit fruit1= new Fruit("berry","sweet");
    fruit1.eat();


}}
