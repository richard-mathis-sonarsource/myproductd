package com.mathiric.myproductd;

public class Rspec4973 {

  private String firstName = "first";
  private String lastName = "last";

  public boolean doSomething() {
      String firstName2 = getFirstName(); // String overrides equals
      String lastName2 = getLastName();

      if (firstName2 == lastName2) { // Non-compliant; false even if the strings have the same value
          return false;
      } else { return true; }
  }

  private String getLastName() {
    return lastName;
  }

  private String getFirstName() {
    return firstName;
  }


}
