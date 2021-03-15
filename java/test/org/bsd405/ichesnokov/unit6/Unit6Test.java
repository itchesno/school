package org.bsd405.ichesnokov.unit6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Unit6Test {

    @Test
    void totalCost() {
        assertEquals(0.5 * (9 + 9) + 10 * (6 + 12) , Unit6.totalCost(new Unit6.Shape[] {
                new Unit6.Shape() {
                    public double area() { return 9; }
                    public double perimeter() { return 6; }
                },
                null,
                new Unit6.Shape() {
                    public double area() { return 9; }
                    public double perimeter() { return 12; }
                }
        }));
    }
}