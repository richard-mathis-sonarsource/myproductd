package com.mathiric.myproductd;

public class Rspec1107 {

    private boolean something;
    private boolean somethingElse;


    public void myMethod() {
        if(something) {
            executeTask();
        } else if (somethingElse) {
            doSomethingElse();
        }
        else {                               // Noncompliant
            generateError();
        }

        try {
            generateOrder();
        } catch (Exception e) {
            log(e);
        }
        finally {                            // Noncompliant
            closeConnection();
        }
    }

    private void executeTask() {
        System.out.println("E");
    }

    private void doSomethingElse() {
        System.out.println("D");
    }

    private void generateError() {
        System.out.println("GE");
    }

    private void generateOrder() {
        System.out.println("GO");
    }

    private void closeConnection() {
        System.out.println("CC");
    }

    private void log(Exception e) {
        System.out.println("Ecp");
    }

}
