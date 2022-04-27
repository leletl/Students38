package com.belhard.university;

public class Main {

	public static void main(String[] args) {
		Address AddressTeacher_1 = new Address ("Minsk","Lenina", 122, 13);
		Teacher Teacher_1 = new Teacher ("Anna","Konoplyanka", AddressTeacher_1, 22,165 );
		Address AddressStudent_1 = new Address ("Orsha","Marshala Zhukova", 2, 1);
		Student Student_1 = new Student ("Harry","Plotter", AddressStudent_1, 25);
		Address AddressStudent_2 = new Address ("Manchester","Random Street", 13, 88);
		Student Student_2 = new Student ("Marcus","Rashford", AddressStudent_2, 26);
		Address AddressStudent_3 = new Address ("Gomel'","Mira", 3, 18);
		Student Student_3 =new Student ("Vladislav","Sinotov", AddressStudent_3, 193);
		Address Residence= new Address ("Minsk","Surganova", 15, 114);
		Student_2.setAddress(Residence);//second student moved to student residence ;
		Teacher_1.setAge(55);
		Teacher_1.teacherSalary(Teacher_1.experiance);
		Group group = new Group();
		group.setNumberOfGroup(1);
		group.setCourse(2);
		group.setTeacher(Teacher_1);
		group.addStudent(Student_1);
		group.addStudent(Student_2);
		group.addStudent(Student_3);
		group.removeStudent(Student_2);
		//group.setStudents(Student_1);
		Teacher_1.setSalary(20000);//change salary
		System.out.println(group.getList());
	}


}
