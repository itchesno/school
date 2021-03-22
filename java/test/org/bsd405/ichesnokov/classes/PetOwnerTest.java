package org.bsd405.ichesnokov.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetOwnerTest {

    @Test
    void printOwnerInfo() {
        Pet pet1 = new Pet("Floppy", "rabbit");
        PetOwner o1 = new PetOwner(pet1, "Jerry");
        o1.printOwnerInfo();

        Pet pet2 = new Dog("Arty", "pug");
        PetOwner o2 = new PetOwner(pet2, "Kris");
        o2.printOwnerInfo();
    }
}