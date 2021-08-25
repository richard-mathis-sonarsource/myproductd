package com.mathiric.myproductd;

public class Rspec3984 {
    private int x = -4;

  public void doSomething() {

      if (x < 0) {
          new IllegalArgumentException("x must be nonnegative");
      }
  }
}
