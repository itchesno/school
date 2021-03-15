package org.bsd405.ichesnokov.classes;

import java.util.Random;

public class MyString extends String2 implements SpecialString {

    private String mPrefix;

    // constructor
    public MyString(String prefix, String text) {
        // we should call constructor of base (String2) class explicitly, with passed string,
        // because of String2 doesn't have parameterless default constructor;
        // we do that with 'super' keyword referencing 'parent' object
        super(text);
        mPrefix = prefix;
    }

    public String toString() {
        // we add prefix to string, which is result of toString() call to parent object (via 'super' keyword)
        return mPrefix + ": " + super.toString();
    }

    // this is implementation of method defined in SpecialString interface
    @Override
    public SpecialString reverse() {
        // get array of characters from string
        char[] characters = super.toString().toCharArray();

        // reverse array
        for (int i = 0; i < characters.length / 2; i++) {
            // i - index of 'left' char, j - index of 'right' char; we need to swap them
            int j = characters.length - i - 1;
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }

        // creates new MyString object with the same prefix and reversed 'body'
        return new MyString(mPrefix, String.valueOf(characters));
    }

    // this method is static as it didn't depend on any MyString object and don't need object to be executed
    public static String randomString(int length)  {
        char[] characters = new char[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int range = 'z' - 'a' + 1;
            characters[i] = (char)('a' + r.nextInt(range));
        }
        return String.valueOf(characters);
    }
}
