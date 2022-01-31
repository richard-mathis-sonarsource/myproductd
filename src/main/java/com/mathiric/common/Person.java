package com.mathiric.common;

//public record Person(String name, int age) {}

public final class Person { // Non compliant
    private final String name;
    private final int age;
    private Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return this.name;}

    public int getAge() {return this.age;}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person newPerson )) {
            return false;
        } else{
            return ((newPerson.age == this.age) && (newPerson.name.equals(this.name)));
        }
    }

    @Override
    public int hashCode() { return (this.age * 5);}

    @Override
    public String toString() { return "my age is "+this.age;}
}