package com.mathiric.myproductd;

import java.util.ArrayList;

public class Rspec1612 {

    public void myfunction() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);

        list.stream().map(x -> square(x));

        list.stream().forEach(x -> System.out.println(x));
    }

    public Integer square(Integer myInt){
        return (myInt * myInt);
    }

}
