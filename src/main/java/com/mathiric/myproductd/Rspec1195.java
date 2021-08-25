package com.mathiric.myproductd;

public class Rspec1195 {

    private int[] values;
    private int[][] values2;

    public int getVector()[] {
            return values;
    }    // Noncompliant

    public int[] getMatrix()[] {
            return values2;
    }  // Noncompliant

}
