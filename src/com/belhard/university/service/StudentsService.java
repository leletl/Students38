package com.belhard.university.service;

import com.belhard.university.model.Student;
import com.belhard.university.repository.StudentsRepository;


public class StudentsService {
    private StudentsRepository studentsRepository;

    public StudentsService (StudentsRepository studentsRepository) {
        this.studentsRepository =studentsRepository;
    }

    public static void addStudent(Student student) {
        System.out.println("add student: " + student.getStudentInfo());
        StudentsRepository.addStudents(student);
    }

    public void removeStudent (Student student) {
        System.out.println("remove student: "  +student.getStudentInfo());
        StudentsRepository.removeStudents(student);
    }


}
