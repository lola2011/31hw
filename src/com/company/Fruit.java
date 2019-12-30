package com.company;

public class Fruit implements Eatable {
    private String type;
    private String taste;
    @Override
    public void eat(){
        System.out.println("we are very sweet and healthy");
    }

    public Fruit(String type, String taste) {
        this.type = type;
        this.taste = taste;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
