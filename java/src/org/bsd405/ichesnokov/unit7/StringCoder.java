package org.bsd405.ichesnokov.unit7;

import java.util.ArrayList;

public class StringCoder {

    private String masterString;

    public static class StringPart {
        public int getStart() { return -1; }
        public int getLength() { return -1; }
    }

    public String decodeString(ArrayList<StringPart> parts) {
        String result = "";

        for (int i = 0; i < parts.size(); i++) {
            result += masterString.substring(parts.get(i).getStart(), parts.get(i).getLength());
        }

        return result;
    }

    public ArrayList<StringPart> encodeString(String word) {
        ArrayList<StringPart> result = new ArrayList<StringPart>();
        int i = 0;
        while (word.length() > 0) {
            StringPart p = findPart(word);
            result.add(p);
            word = word.substring(0, word.length() - p.getLength());
        }
        return result;
    }

    // TODO
    private StringPart findPart(String text) { return null; }
}
