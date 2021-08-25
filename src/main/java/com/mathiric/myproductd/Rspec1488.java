package com.mathiric.myproductd;

public class Rspec1488 {

    private long hours;
    private long minutes;
    private long seconds;

    public long computeDurationInMilliseconds() {
        long duration = (((hours * 60) + minutes) * 60 + seconds ) * 1000 ;
        return duration;
    }

    public void doSomething() {
        RuntimeException myException = new RuntimeException();
        throw myException;
    }
}
