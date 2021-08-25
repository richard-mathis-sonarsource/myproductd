package com.mathiric.myproductd;

public class Rspec1172 {

    public void doSomething(int a, int b) {
        compute(a);
    }

    public void doSomething2(int a, int b, int c) {
        compute(a);
    }

    public void doSomething3(int a, int b, int c, int d) {
        compute(a, c);
    }

    private void compute(int a) {
        a++;
    }

    private void compute(int a, int b) {
        a = a+b;
    }

}
