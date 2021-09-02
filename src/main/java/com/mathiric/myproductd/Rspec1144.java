package com.mathiric.myproductd;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Rspec1144 implements Serializable {

  private Rspec1144(){}     //Compliant, private empty constructor intentionally used to prevent any direct instantiation of a class.
  public static void doSomething(){
    System.out.println("beauty");
  }

  private void unusedPrivateMethod(){ System.out.println("unused");}
  private void writeObject(ObjectOutputStream s){ System.out.println("out");}  //Compliant, relates to the java serialization mechanism
  private void readObject(ObjectInputStream in){ System.out.println("in");}  //Compliant, relates to the java serialization mechanism

}
