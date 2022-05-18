package com.belhard.university.util;

import com.belhard.university.base.Person;
import com.belhard.university.model.Address;
import com.belhard.university.model.Student;
import com.belhard.university.model.Teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileParserUtil  {
    public static ArrayList<Student> parser() {
        ArrayList <Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("Students.txt");
            int a;
            String name = "";
            while ((a = fileInputStream.read()) != -1)
            {
                name += (char)a;
            }
            fileInputStream.close();
            String [] massStr = name.split("\r");
            for (String str: massStr) {
                String [] massName = str.split(" ");
                students.add(new Student(massName[0],massName[1], massName[2],
                        new Address(massName[4], massName[5], Integer.parseInt(massName[6],10),Integer.parseInt(massName[7],10)),
//                                Integer.parseInt(massName[7])),
                        Integer.parseInt(massName[3])));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Тест");
        students.stream().forEach(s-> System.out.println(s));
        return students;
    }
}

    public static ArrayList<Teacher> parser() {
        ArrayList <Teacher> teachers = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("Students.txt");
            int a;
            String name = "";
            while ((a = fileInputStream.read()) != -1)
            {
                name += (char)a;
            }
            fileInputStream.close();
            String [] massStr = name.split("\r");
            for (String str: massStr) {
                String [] massName = str.split(" ");
                teachers.add(new Teacher(massName[0],
                        massName[1],
                        massName[2],
                        Integer.parseInt(massName[3]),
                        new Address(massName[4], massName[5], Integer.parseInt(massName[6],10),Integer.parseInt(massName[7],10)),
                        Integer.parseInt(massName[3]),
                                Integer.parseInt(massName[8])));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Тест");
        teachers.stream().forEach(s-> System.out.println(s));
        return teachers;
    }
}
