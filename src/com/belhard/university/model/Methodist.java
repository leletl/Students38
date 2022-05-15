package com.belhard.university.model;

import com.belhard.university.base.Person;

import java.net.DatagramPacket;

public class Methodist extends Person {
    private String methodistInfo;
    int age;

    public Methodist(String name, String surname, String sex, int age, Address address) {
        super(name, surname, sex, address);
        this.age = age;
        this.methodistInfo = new String(getName() + " " + getSurname() + " " + getAge() + " " + address.getAddress());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMethodistInfo() {
        return methodistInfo;
    }

    public void displayInfo() {
        System.out.println("Methodist is: " + getMethodistInfo() + "\n");
    }
}
