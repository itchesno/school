package org.bsd405.ichesnokov.unit6;

public class Meal {
    private String name;
    private Double price;

    public Meal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " meal, $" + price;
    }
}
