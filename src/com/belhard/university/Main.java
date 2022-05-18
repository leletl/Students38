package com.belhard.university;

import com.belhard.university.model.*;
import com.belhard.university.repository.GroupRepository;
import com.belhard.university.repository.StudentsRepository;
import com.belhard.university.repository.TeacherRepository;
import com.belhard.university.service.GroupService;
import com.belhard.university.service.StudentsService;
import com.belhard.university.service.TeacherService;
import com.belhard.university.util.Converter;
import com.belhard.university.util.FileParserUtil;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		GroupRepository groupRepository = new GroupRepository();
		GroupService groupService = new GroupService(groupRepository);
		Address AddressTeacher_1 = new Address("Minsk", "Lenina", 122, 13);
		Teacher Teacher_1 = new Teacher("Anna", "Konoplyanka", "F", 65, AddressTeacher_1, 22, 165);
		Address AddressTeacher_2 = new Address("Minsk", "Kolasa", 15, 123);
		Teacher Teacher_2 = new Teacher("Maxim", "Pivovarov", "M", 55, AddressTeacher_2, 12, 165);
		Address AddressStudent_1 = new Address("Orsha", "Marshala Zhukova", 2, 1);
		Student Student_1 = new Student("Harry", "Plotter", "M", AddressStudent_1, 25);
		Address AddressStudent_2 = new Address("Manchester", "Random Street", 13, 88);
		Student Student_2 = new Student("Marcus", "Rashford", "M", AddressStudent_2, 26);
		Address AddressStudent_3 = new Address("Gomel'", "Mira", 3, 18);
		Student Student_3 = new Student("Vladislav", "Sinotov", "M", AddressStudent_3, 19);
		Address Residence = new Address("Minsk", "Surganova", 15, 114);
		Teacher Teacher_3 = new Teacher("Vladimir", "Malevich", "M", 44, Residence, 23, 165);
		FileParserUtil.parserTeacher();
		FileParserUtil.parser();
		Converter<Teacher, Methodist> converter = x -> new Methodist(x.getName(), x.getSurname(), x.getSex(), x.getAge(), x.getAddress());
		Methodist methodist = converter.convert(Teacher_3);
		methodist.displayInfo();
		Student_2.setAddress(Residence);
		Teacher_1.setAge(65);
		Teacher_2.setAge(55);
		TeacherService.teacherSalary(Teacher_1);
		TeacherService.teacherSalary(Teacher_2);
		StudentsService.addStudent(Student_1);
		StudentsService.addStudent(Student_2);
		StudentsService.addStudent(Student_3);
		TeacherService.addTeacher(Teacher_1);
		TeacherService.addTeacher(Teacher_2);
		Teacher.setTeachersList(TeacherRepository.getTeachersList());
		Teacher.displayAllSortedByInfo();
		Teacher.displayAllSortedByAge();
		Teacher.displayPension();
		Teacher.displayRich(1000);
		Group group = new Group();
		group.addGroup(group);
		group.setYearOfAdmission(2015);
		group.setYearOfGraduate(2022);
		group.setNumberOfGroup(1);
		group.setCourse(2);
		group.setStudents(FileParserUtil.parser());
		group.addTeacher(FileParserUtil.parserTeacher().get(0));
//		groupService.SetNumberOfGroup(group);
		ArrayList<Group> groups = new ArrayList<>();
		groups.add(group);
		groupService.addGroups(groups);
		Teacher_1.setSalary(20000);//change salary
		Group.yearRange(2014, 2033);
	}
}
