package com.mathiric.myproductd;

public class Rspec1123 {

    @Deprecated
    public void foo1() {
    }

    /**
     * @deprecated
     */
    public void foo2() {    // Noncompliant
    }
}
