package com.mathiric.myproductd;

import java.util.ArrayList;
import java.util.Collection;

public class Rspec1155 {

    public void myList(String list, Collection mycollect) {

        ArrayList<String> myCollection = new ArrayList<>() ;

        if (myCollection.size() == 0) {
            System.out.println(list + "Empty");
        }

        boolean b = 1 > mycollect.size();
        System.out.println(b);
    }
}
