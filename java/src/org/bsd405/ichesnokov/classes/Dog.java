package org.bsd405.ichesnokov.classes;

public class Dog extends Pet {
    private String breed;

    public Dog(String n, String b) {
        super(n, "dog");
        breed = b;
    }

    public void printPetInfo() {
        super.printPetInfo();
        System.out.print(" of breed " + breed);
    }
}
