package org.bsd405.ichesnokov.unit6;

public class DeluxeMeal extends Meal {

    private String side;
    private String drink;

    public DeluxeMeal(String name, String side, String drink, double price) {
        super(name, price + 3);
        this.side = side;
        this.drink = drink;
    }

    public String toString() {
        return "deluxe " + super.toString();
    }
}
