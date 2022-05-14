package com.belhard.university.repository;

import com.belhard.university.model.Student;

import java.util.ArrayList;

public class StudentsRepository {
    static ArrayList <Student> students = new ArrayList<>();

    public static boolean addStudents(Student student) {
        students.add(student);
        return true;
    }

    public static boolean removeStudents(Student student) {
        students.remove(student);
        return true;
    }
    public static ArrayList<Student> getStudents() {
        return students;
    }
}
