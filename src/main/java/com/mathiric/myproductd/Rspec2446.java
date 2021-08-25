package com.mathiric.myproductd;

public class Rspec2446 extends Thread{

  @Override
  public void run(){
    synchronized(this){
      notify();  // Noncompliant
    }
  }
}
