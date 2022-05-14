package com.belhard.university.model;

import com.belhard.university.base.Person;
import com.belhard.university.util.TeacherAgeComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Teacher extends Person implements Comparable<Teacher>{
	private int age;
	double salary;
	int experiance;
	private static double worktime;
	private String teacherInfo;
	private static ArrayList <Teacher> teachersList= new ArrayList<> ();

	public Teacher(String name, String surname, String sex, int age, Address address, int experiance, double worktime) {
		super(name, surname, sex, address);
		this.experiance = experiance;
		this.age = age;
		this.worktime = worktime;
		this.teacherInfo= new String (name+" "+surname+" "+address.getAddress()) ;
	}

	public static double getWorktime() {
		return worktime;
	}

	public void setWorktime(double worktime) {
		this.worktime = worktime;
	}

	public int getAge() {
		return age;
	}
	
	public String getTeacherInfo() {
		return teacherInfo;
	} 


	public  void setAge (int age) {
		if (age>0 && age<100)
			this.age = age;			
	}
	
//	public double teacherSalary(int experiance) {
//		return salary = (0.25*experiance + 3.5)*worktime;
//	}
	
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

	public static void setTeachersList(ArrayList<Teacher> teachersList) {
		Teacher.teachersList = teachersList;
	}

	static Comparator<Teacher> AgeComparator = new TeacherAgeComparator();

	public static boolean addTeacher(Teacher teacher) {
		teachersList.add(teacher);
		return  true;
	}

	public static void displayAllSortedByInfo() {
		System.out.println("Все учителя (сортированы по Имени и Фамилии): ");
		teachersList.stream().sorted().forEach(s-> {
			System.out.println(s);});
		System.out.println();
	}

	public static void displayAllSortedByAge () {
		System.out.println("Все учителя (сортированы по возрасту): ");
		teachersList.stream().sorted(AgeComparator).forEach(s-> System.out.println(s));
		System.out.println();
	}

	public static void displayPension() {
		System.out.println("Учителя на пенсии: ");
		teachersList.stream().filter(s->(s.getSex().equals("F") && s.age>58)||(s.age>63 && s.getSex().equals("M")))
				.forEach(s-> System.out.println(s.getTeacherInfo()+" Age: "+s.getAge()));
		System.out.println();
	}

	public static void  displayRich (int salary) {
		System.out.println("Учителя с ЗП больше указанного значения: ");
		teachersList.stream().filter(s->s.salary >salary).forEach(s-> System.out.println(s.getTeacherInfo()+" Salary: "+ s.getSalary()));
		System.out.println();
	}

	@Override
	public String toString() {
		return teacherInfo+" Возраст: "+ age+" Зарплата: "+salary+" Опыт: "+experiance+" Пол: "+ getSex();
	}

	@Override
	public int compareTo(Teacher o) {
		int rez =this.getName().compareTo(o.getName());
		if (this.getName().compareTo(o.getName())==0){
		rez =  this.getSurname().compareTo(o.getSurname());}
		return rez;
	}

}

