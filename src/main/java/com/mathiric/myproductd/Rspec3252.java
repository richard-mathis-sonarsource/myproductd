package com.mathiric.myproductd;

public class Rspec3252 {

    public static int counter;

    class Child extends Rspec3252{
        public Child(){
            Child.counter++;
        }

        public void doSomething(){
            Child.counter++;
        }

    }
}
