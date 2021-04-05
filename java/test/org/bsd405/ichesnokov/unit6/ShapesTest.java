package org.bsd405.ichesnokov.unit6;

import org.bsd405.ichesnokov.classes.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    @Test
    void totalCost() {
        assertEquals(0.5 * (9 + 9) + 10 * (6 + 12) , Shapes.totalCost(new Shapes.Shape[] {
                new Shapes.Shape() {
                    public double area() { return 9; }
                    public double perimeter() { return 6; }
                },
                null,
                new Shapes.Shape() {
                    public double area() { return 9; }
                    public double perimeter() { return 12; }
                }
        }));
    }

}