package org.bsd405.ichesnokov.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    @Test
    void testToString() {
        MyString str = new MyString("testPrefix", "abc");
        assertEquals("testPrefix: abc", str.toString());
    }

    @Test
    void reverse() {
        MyString str = new MyString("testPrefix", "abc");
        SpecialString reversedStr = str.reverse();
        assertEquals("testPrefix: cba", reversedStr.toString());
    }

    @Test
    void randomString() {
        String random = MyString.randomString(10);

        // check length of random string
        assertEquals(10, random.length());

        // check that random string has only 'a'..'z' characters
        char[] chars = random.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            assertTrue(chars[i] >= 'a' && chars[i] <= 'z');
        }
    }
}