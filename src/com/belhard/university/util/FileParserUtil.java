package com.belhard.university.util;

import com.belhard.university.model.Address;
import com.belhard.university.model.Student;
import com.belhard.university.model.Teacher;
import com.belhard.university.service.TeacherService;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileParserUtil {
    public static ArrayList<Student> parser() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("Students.txt");
            int a;
            String name = "";
            while ((a = fileInputStream.read()) != -1) {
                name += (char) a;
            }
            fileInputStream.close();
            String[] massStr = name.split("\r\n");
            for (String str : massStr) {
                String[] massName = str.split(" ");
                Student student = new Student(massName[0], massName[1], massName[2],
                        new Address(massName[4], massName[5], Integer.parseInt(massName[6]),
                                Integer.parseInt(massName[7])),
                                Integer.parseInt(massName[3]));
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static ArrayList<Teacher> parserTeacher() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("Teachers.txt");
            int a;
            String name = "";
            while ((a = fileInputStream.read()) != -1) {
                name += (char) a;
            }
            fileInputStream.close();
            String[] massStr = name.split("\r\n");
            for (String str : massStr) {
                String[] massName = str.split(" ");
                Teacher teacher = new Teacher(massName[0],
                        massName[1],
                        massName[2],
                        Integer.parseInt(massName[3]),
                        new Address(massName[4], massName[5], Integer.parseInt(massName[6], 10), Integer.parseInt(massName[7], 10)),
                        Integer.parseInt(massName[3]),
                        Integer.parseInt(massName[7]));
                double salary = TeacherService.teacherSalaryByExperianceAndWorktinme(Double.parseDouble(massName[8]), Double.parseDouble(massName[9]));
                teacher.setSalary(salary);
                teachers.add(teacher);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Тест");
        teachers.stream().forEach(s -> System.out.println(s));
        return teachers;
    }
}
