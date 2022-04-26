package com.belhard.university;

public abstract class Person {
    String name;
    String surname;
    Address address;

    public Person(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
}
