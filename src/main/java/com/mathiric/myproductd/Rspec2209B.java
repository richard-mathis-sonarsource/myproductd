package com.mathiric.myproductd;

public class Rspec2209B {
  private Rspec2209 first = new Rspec2209();
  private Rspec2209 second = new Rspec2209();

  public void runUpTheCount() {
    first.counter ++;  // Noncompliant
    second.counter ++;  // Noncompliant. A.counter is now 2, which is perhaps contrary to expectations
  }
}