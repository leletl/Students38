package com.belhard.university.util;

import com.belhard.university.Teacher;

import java.util.Comparator;

public class TeacherAgeComparator implements Comparator <Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getAge() - o2.getAge();
    }
}
