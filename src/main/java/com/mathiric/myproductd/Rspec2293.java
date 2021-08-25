package com.mathiric.myproductd;

import java.util.ArrayList;
import java.util.List;

public class Rspec2293 {

    public void myStrings(String list) {

        List<String> strings = new ArrayList<String>();  // Noncompliant

        System.out.println(list + strings.get(0));
    }
}
