package com.mathiric.myproductd;

public class Rspec131 {

    public enum Day {        SUNDAY, MONDAY }

    public void doSomething(Day  day) {
        switch(day) {
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            case MONDAY:
                System.out.println("Monday!");
                break;
        }

    }
}
