package com.belhard.university;

import com.belhard.university.Address;

public class Teacher extends Person {
	private String name;
	private String surname;
	private int age;
	double salary;
	int experiance;
	private double worktime;
	private Address address;
	private String teacherInfo;

	public Teacher(String name, String surname, Address address,int experiance, double worktime) {
		super(name, surname, address);
		this.experiance = experiance;
		this.worktime = worktime;
		this.teacherInfo= new String (name+" "+surname+" "+address.getAddress()) ;
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

	public double getWorktime() {
		return worktime;
	}

	public void setWorktime(double worktime) {
		this.worktime = worktime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}
	
	public String getTeacherInfo() {
		return teacherInfo;
	} 
	
	public  void setTeacherInfo (String teacherInfo) {
		this.teacherInfo = teacherInfo;		
	}

	public  void setAge (int age) {
		if (age>0 && age<100)
			this.age = age;			
	}
	
	void teacherSalary(int experiance) {
		salary = (0.25*experiance + 3.5)*worktime;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	void displayInfo () {
		System.out.println (name+" "+surname+ " "+salary+ " "+ experiance+" " + age + " " + address.getAddress());
	}
	
}
