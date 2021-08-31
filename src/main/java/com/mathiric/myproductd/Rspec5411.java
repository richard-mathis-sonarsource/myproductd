package com.mathiric.myproductd;

public class Rspec5411 {

    Boolean myBoolean = Boolean.TRUE;

    public void doSomething() {
        Boolean b = getBoolean();
        if (b) {  // Noncompliant, it will throw NPE when b == null
            foo();
        } else {
            bar();
        }
    }

    private Boolean getBoolean() { return myBoolean;}

    private void foo() {
        System.out.println("foo");
    }

    private void bar() {
        System.out.println("bar");
    }
}
