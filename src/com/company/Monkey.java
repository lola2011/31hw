package com.company;

public class Monkey implements Climbable, Carriable {
    private int weight;
    private String kind;

    @Override
    public void climb() {
        System.out.println("Monkeys can easily climb the trees");
    }

    @Override
    public void carry() {
        System.out.println("Monkey can carry another small monkey");
    }


public Monkey(){

}
    public Monkey(int weight, String kind) {
        this.weight = weight;
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
