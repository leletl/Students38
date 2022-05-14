package com.belhard.university.model;

import java.util.ArrayList;

public class Group {
	private int YearOfAdmission;
	private int YearOfGraduate;
	private int NumberOfGroup;
	private int Course;
	private Teacher teacher;
	private ArrayList <Student> students = new ArrayList <>();
	private ArrayList <Teacher> teachers = new ArrayList<>();
	private static ArrayList <Group> groups = new ArrayList<>();

	public int getYearOfAdmission() {
		return YearOfAdmission;
	}

	public void setYearOfAdmission(int yearOfAdmission) {
		YearOfAdmission = yearOfAdmission;
	}

	public int getYearOfGraduate() {
		return YearOfGraduate;
	}

	public void setYearOfGraduate(int yearOfGraduate) {
		YearOfGraduate = yearOfGraduate;
	}

	public int getNumberOfGroup() {
		return NumberOfGroup;
	}
	
	public void setNumberOfGroup(int numberOfGroup) {
		NumberOfGroup = numberOfGroup;
	}
	
	public int getCourse() {
		return Course;
	}
	
	public void setCourse(int course) {
		Course = course;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public boolean addTeacher (Teacher teacher) {
		teachers.add(teacher);
		return true;
	}

	public boolean removeTeacher (Teacher teacher) {
		teachers.remove(teacher);
		return true;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public boolean addGroup (Group group) {
		groups.add(group);
		return true;
	}
	public static void yearRange (int first, int second) {
		groups.stream().filter(s->s.YearOfAdmission>first&&s.YearOfGraduate<second)
				.forEach(s-> System.out.println("Группы в указанном диапазоне: "+s+"\n"));
	}

	@Override
	public String toString() {
		return "Group: " +
				" Number of group: " + NumberOfGroup +
				", Year of admission: " + YearOfAdmission +
				", Year of graduate: " + YearOfGraduate +
				", Course=" + Course + "\n"+
				"Teachers=" + teachers +  "\n"+
				"Students="+  students + "\n";
	}
}
	

