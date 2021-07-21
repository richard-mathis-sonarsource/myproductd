package com.mathiric.myproductd;

import java.lang.reflect.Field;

record PersonAsRecord(String name, int age) {}

public class Rspec6216 {

    public void setField() throws NoSuchFieldException, IllegalAccessException{
        PersonAsRecord person = new PersonAsRecord("A", 26);
        Field field = PersonAsRecord.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // Noncompliant
    }
}
