package com.mathiric.myproductd;

import com.mathiric.common.Color;

import java.util.HashSet;

public class Rspec1319 {

  private HashSet<Color> colors = new HashSet<>();  // Noncompliant - "colors" should have type "Set" rather than "HashSet"

  public HashSet<Color> getColors() {                       // Noncompliant
    return colors;
  }

}
