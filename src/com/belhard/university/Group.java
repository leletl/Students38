package com.belhard.university;

import java.util.ArrayList;

public class Group {
	private int NumberOfGroup;
	private int Course;
	private Teacher teacher;
	private ArrayList <Student> students = new ArrayList <>();
	//private Address address;
	String teacherinfo;
	
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
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public boolean addStudent (Student student) {
		students.add(student);
			return true;
	}
	
	public boolean removeStudent (Student student) {
		students.remove(student);
			return true;
	}
	
	public String getList() {
		String list = "Group number: " + NumberOfGroup + "; Course: "+ Course+"\n";
		list+="Teacher: "+teacher.getTeacherInfo()+" Salary: "+teacher.getSalary()+"\n";
		for (int i=0; i<students.size();i++) {
			Student student =  students.get(i);
			list+="Student: "+student.getStudentInfo()+"\n";
		}
		
		return list;
	}
}
	

