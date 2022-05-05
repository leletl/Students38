package com.belhard.university.util;

import com.belhard.university.exception.OldException;
import com.belhard.university.exception.YoungException;

public class AgeUtil {
    public static void checkAge(int age) {


        try {
            checkAgeYoung(age);
            checkAgeOld(age);
        } catch (YoungException | OldException e) {
            e.printStackTrace();
        }

    }

    private static void checkAgeYoung(int age) throws YoungException {
        if (age < 16) {
            throw new YoungException("Too young for study");
        }
    }

    private static void checkAgeOld(int age) throws OldException {
        if (age > 100) {
            throw new OldException("Too old for study");
        }
    }
}
