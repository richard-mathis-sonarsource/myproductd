package com.mathiric.myproductd;

public class Rspec1161 {

    public void doSomething() {
        System.out.println("Hello I am the parent");
    }

    protected class Rspec1161Child extends Rspec1161 {

         public void doSomething() {
            System.out.println("Hello I am the child");
        }
    }
}
