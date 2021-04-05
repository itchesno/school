package org.bsd405.ichesnokov.unit7;

import org.bsd405.ichesnokov.classes.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {

    @Test
    void compareTo() {
        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Anderson", 1002);
        Customer c3 = new Customer("Smith", 1003);

        assertTrue(c1.compareTo(c2) > 0);
        assertTrue(c1.compareTo(c3) < 0);
        assertTrue(c2.compareTo(c3) < 0);
        assertTrue(c1.compareTo(c1) == 0);
    }
}
