package com.mathiric.myproductd;

public class Rspec2200 implements Comparable<Integer>{

  public void doSomething(int arg) {
    if (this.compareTo(arg) == -1) {  // Noncompliant
          // ll
    }
  }

  public int compareTo(Integer arg) {
      return arg > 0 ? 1 : 0;
  }
}
