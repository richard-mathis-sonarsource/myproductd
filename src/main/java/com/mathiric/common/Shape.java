package com.mathiric.common;

public sealed class Shape permits Circle, Rectangle, Square {

    public void show() {
        System.out.println(this.getClass());
    }
}