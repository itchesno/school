package org.bsd405.ichesnokov.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void printPetInfo() {
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();
    }
}