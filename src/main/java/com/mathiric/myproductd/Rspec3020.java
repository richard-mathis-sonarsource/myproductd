package com.mathiric.myproductd;

import java.util.List;

public class Rspec3020 {

    public String [] getStringArray(List<String> strings) {
        return (String []) strings.toArray();  // Noncompliant; ClassCastException thrown
    }
}
