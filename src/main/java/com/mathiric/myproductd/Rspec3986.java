package com.mathiric.myproductd;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Rspec3986 {

    public void doSomething() {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //Noncompliant; yields '2016/12/31'
        result = DateTimeFormatter.ofPattern("YYYY/MM/dd").format(date); //Noncompliant; yields '2016/12/31'
    }
}
