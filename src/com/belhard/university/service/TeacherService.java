package com.belhard.university.service;

import com.belhard.university.model.Teacher;
import com.belhard.university.repository.TeacherRepository;

public class TeacherService {
    private TeacherRepository teacherRepository;

    public static void addTeacher(Teacher teacher) {
        System.out.println("add Teacher: " + teacher.getTeacherInfo());
        TeacherRepository.addTeacher(teacher);
    }

    public static void removeTeacher(Teacher teacher) {
        System.out.println("remove Teacher: " + teacher.getTeacherInfo());
        TeacherRepository.removeTeacher(teacher);
    }

    public static double teacherSalary(Teacher teacher) {
        double experiance = teacher.getExperiance();
        double worktime = teacher.getWorktime();
        double salary = (0.25 * experiance + 3) * worktime;
        teacher.setSalary(salary);
        return salary;
    }
    public static double teacherSalaryByExperianceAndWorktinme(double experiance, double worktime) {
        double salary = (0.25 * experiance + 3) * worktime;
        return salary;
    }
}
