package org.bsd405.ichesnokov.classes;

import org.bsd405.ichesnokov.classes.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFirstName() {
        Person p = new Person("Ivan", "Chesnokov");
        assertEquals("Ivan", p.getFirstName());
    }

    @Test
    void getLastName() {
        Person p = new Person("Ivan", "Chesnokov");
        assertEquals("Chesnokov", p.getLastName());
    }
}