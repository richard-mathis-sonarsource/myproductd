package com.mathiric.myproductd;

public class Rspec1116 {

    void doSomething() {
        ;  // Noncompliant - was used as a kind of TODO marker
    }

    void doSomethingElse() {
        System.out.println("Hello, world!");;  // Noncompliant - double ;
    }
}
