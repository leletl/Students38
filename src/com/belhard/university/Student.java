package com.belhard.university;

import com.belhard.university.Address;
import com.belhard.university.util.AgeUtil;

public class Student extends Person {
private String name;
private String surname;
private int age;
private Address address;
private String studentInfo;

	public Student(String name, String surname, Address address, int age) {
		super(name, surname, address);
		AgeUtil.checkAge(age);
		this.age = age;
		this.studentInfo= new String (name+" "+surname+" "+address.getAddress()) ;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	
	public  void setAge (int age) {
		if (age>0 && age<100)
			this.age = age;			
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getStudentInfo() {
		return studentInfo;
	} 
	
	public  void setStudentInfo (String studentInfo) {
		this.studentInfo = studentInfo;		
	}

	void displayInfo () {
		System.out.println (name+" "+surname+ " "+ age + " " + address.getAddress());
	}
}
