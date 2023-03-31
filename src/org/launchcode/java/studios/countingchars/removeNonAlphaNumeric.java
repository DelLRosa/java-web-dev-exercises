package org.launchcode.java.studios.countingchars;

public class removeNonAlphaNumeric {
    public static String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[\\W]+", "");
    }
}
