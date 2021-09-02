package com.mathiric.myproductd;

public class Rspec1125 {
    boolean booleanVariable = true;
    boolean exp = false;

    public void doSomething() {
        if (booleanMethod() == true) { System.out.println("if");}
        if (booleanMethod() == false) { System.out.println("if");}
        if (booleanMethod() || false) { System.out.println("if");}
        goNext(!false);
        goNext(booleanMethod() == true);

        booleanVariable = booleanMethod() ? true : false;
        booleanVariable = booleanMethod() ? true : exp;
        booleanVariable = booleanMethod() ? false : exp;
        booleanVariable = booleanMethod() ? exp : true;
        booleanVariable = booleanMethod() ? exp : false;

    }

    private boolean booleanMethod() {
        return booleanVariable;
    }

    private void goNext(boolean myBool) {
        System.out.println(myBool);
    }

}
