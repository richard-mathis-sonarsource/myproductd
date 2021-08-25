package com.mathiric.myproductd;

public class Rspec2325 {

    private static String magicWord = "magic";

    private String getMagicWord() { // Noncompliant
        return magicWord;
    }

    private void setMagicWord(String value) { // Noncompliant
        magicWord = value;
    }
}
