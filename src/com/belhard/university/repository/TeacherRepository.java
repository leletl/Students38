package com.belhard.university.repository;

import com.belhard.university.model.Teacher;

import java.util.ArrayList;

public class TeacherRepository {

    private static ArrayList <Teacher> teachersList= new ArrayList<> ();

    public static boolean addTeacher(Teacher teacher) {
        teachersList.add(teacher);
        return true;
    }

    public static boolean removeTeacher (Teacher teacher) {
        teachersList.remove(teacher);
        return true;
    }

    public static ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }
}
