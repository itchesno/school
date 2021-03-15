package org.bsd405.ichesnokov.unit6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testMeal() {
        Meal burger = new Meal("burger", 7.49);
        assertEquals("burger meal, $7.49", burger.toString());
    }

    @Test
    void testDeluxeMeal() {
        // this also works since DeluxeMeal is Meal
        //Meal burger = new DeluxeMeal("burger", "chips", "lemonade", 7.49);
        DeluxeMeal burger = new DeluxeMeal("burger", "chips", "lemonade", 7.49);
        assertEquals("deluxe burger meal, $10.49", burger.toString());
    }
}