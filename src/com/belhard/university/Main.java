package com.belhard.university;

public class Main {

	public static void main(String[] args) {
		Address AddressTeacher_1 = new Address ("Minsk","Lenina", 122, 13);
		Teacher Teacher_1 = new Teacher ("Anna","Konoplyanka", "F", AddressTeacher_1, 22,165 );
		Address AddressTeacher_2 = new Address ("Minsk","Kolasa", 15, 123);
		Teacher Teacher_2 = new Teacher ("Maxim","Pivovarov", "M", AddressTeacher_2, 22,165 );
		Address AddressStudent_1 = new Address ("Orsha","Marshala Zhukova", 2, 1);
		Student Student_1 = new Student ("Harry","Plotter", "M", AddressStudent_1, 25);
		Address AddressStudent_2 = new Address ("Manchester","Random Street", 13, 88);
		Student Student_2 = new Student ("Marcus","Rashford",  "M",AddressStudent_2, 26);
		Address AddressStudent_3 = new Address ("Gomel'","Mira", 3, 18);
		Student Student_3 =new Student ("Vladislav","Sinotov", "M",AddressStudent_3, 19);
		Address Residence= new Address ("Minsk","Surganova", 15, 114);
		Student_2.setAddress(Residence);//second student moved to student residence ;
		Teacher_1.setAge(55);
		Teacher_2.setAge(65);
		Teacher_1.teacherSalary(Teacher_1.experiance);
		Teacher_2.teacherSalary(10);
		Teacher.addTeacher(Teacher_1);
		Teacher.addTeacher(Teacher_2);
		System.out.println("Все учителя: ");
		Teacher.displayArray();
		System.out.println("Учителя на пенсии: ");
		Teacher.displayPension();
		System.out.println("Учителя с ЗП больше указанного значения: ");
		Teacher.displayRich(1000);
		Group group = new Group();
		group.addGroup(group);
		group.setYearOfAdmission(2015);
		group.setYearOfGraduate(2022);
		group.setNumberOfGroup(1);
		group.setCourse(2);
		group.addTeacher(Teacher_2);
		group.addStudent(Student_1);
		group.addStudent(Student_2);
		group.addStudent(Student_3);
		group.removeStudent(Student_2);
		Teacher_1.setSalary(20000);//change salary
		System.out.println("Группы в указанном диапазоне: ");
		Group.yearRange(2014,2025);
	}


}
