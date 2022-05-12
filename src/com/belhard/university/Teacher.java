package com.belhard.university;

import com.belhard.university.util.TeacherAgeComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Teacher extends Person implements Comparable<Teacher>{
	private int age;
	double salary;
	int experiance;
	private double worktime;
	//private Address address;
	private String teacherInfo;
	private static ArrayList <Teacher> teachersList= new ArrayList<> ();

	public Teacher(String name, String surname, String sex, Address address,int experiance, double worktime) {
		super(name, surname, sex, address);
		this.experiance = experiance;
		this.worktime = worktime;
		this.teacherInfo= new String (name+" "+surname+" "+address.getAddress()) ;
	}

	public double getWorktime() {
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
		System.out.println (name+" "+surname+ " "+salary+ " "+ experiance+" " + age + " " );
	}

	static Comparator<Teacher> AgeComparator = new TeacherAgeComparator();

	public static boolean addTeacher(Teacher teacher) {
		teachersList.add(teacher);
		return  true;
	}
	public static void displayAllSortedByInfo() {
		teachersList.stream().sorted().forEach(s-> {
			System.out.println(s);});
		System.out.println();
	}

	public static void displayAllSortedByAge () {
		teachersList.stream().sorted(AgeComparator).forEach(s-> System.out.println(s));
		System.out.println();
	}

	public static void displayPension() {
		teachersList.stream().filter(s->(s.sex.equals("F") && s.age>58)||(s.age>63 && s.sex.equals("M")))
				.forEach(s-> System.out.println(s.getTeacherInfo()+" Age: "+s.getAge()));
		System.out.println();
	}

	public static void  displayRich (int salary) {
		teachersList.stream().filter(s->s.salary >salary).forEach(s-> System.out.println(s.getTeacherInfo()+" Salary: "+ s.getSalary()));
		System.out.println();
	}

	@Override
	public String toString() {
		return teacherInfo+" Возраст: "+ age+" Зарплата: "+salary+" Опыт: "+experiance+" Пол: "+ sex;
	}

	@Override
	public int compareTo(Teacher o) {
		int rez =this.name.compareTo(o.name);
		if (this.name.compareTo(o.name)==0){
		rez =  this.surname.compareTo(o.surname);}
		return rez;
	}
}

