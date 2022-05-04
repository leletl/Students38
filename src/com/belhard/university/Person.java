package com.belhard.university;

public abstract class Person {
    String name;
    String surname;
    String sex;
    Address address;


    public Person(String name, String surname, String sex, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
