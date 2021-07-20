package com.mathiric.myproductd;

final class Rspec6201 { // Noncompliant
    private final String name;
    private final int age;

    public Rspec6201(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean myEquals(Object o) {
        if (!(o instanceof Rspec6201)) {
            return false;
        } else{
            Rspec6201 newPerson = (Rspec6201) o;
            return ((newPerson.age == this.age) && (newPerson.name.equals(this.name)));
        }
    }

}