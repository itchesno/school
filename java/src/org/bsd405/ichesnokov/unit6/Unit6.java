package org.bsd405.ichesnokov.unit6;

import java.util.ArrayList;

public class Unit6 {
    public static interface Shape {
        double area();
        double perimeter();
    }

    public static double totalCost(Shape[] shapes){
        double total = 0;
        for (int i = 0; i < shapes.length; i++){
            if (shapes[i] != null) {
                double a = shapes[i].area();
                double p = shapes[i].perimeter();
                total += 0.5*a + 10*p;
            }
        }
        return total;
    }

}
