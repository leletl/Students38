package com.belhard.lesson7;

public class Task7_8 {
    public static void main(String[] args) {
        String str1 = "ПерваяЯ произвольная строка";
        String str2 = "Вторая произвольная стрОка";

        if(equa(str1, str2)) {
            System.out.println("(equals) Последние 5 символов совпадают");
        } else {
            System.out.println("(equals) Последние 5 символов НЕ совпадают");
        }

        if(equa1(str1, str2)) {
            System.out.println("(equalsIgnoreCase) Последние 5 символов совпадают");
        } else {
            System.out.println("(equalsIgnoreCase) Последние 5 символов НЕ совпадают");
        }

        if(equa2(str1, str2)) {
            System.out.println("(endWith) Последние 5 символов совпадают");
        } else {
            System.out.println("(endWith) Последние 5 символов НЕ совпадают");
        }

        if(index(str1, str2)) {
            System.out.println("(indexOf) В обоих строчках есть символ я");
        } else {
            System.out.println("(indexOf) В одной или нескольких строках отсутствует символ я");
        }
    }

    static boolean equa(String str1, String str2) {
        boolean rez = false;

        if (str1.length()>=5 && str2.length()>=5); {
            char[] ch1Last = new char[5];
            str1.getChars(str1.length()-5, str1.length(), ch1Last, 0);
            String s1 = new String(ch1Last);
            System.out.println("Последние 5 символов первой строки: " +s1);

            char[] ch2Last = new char[5];
            str2.getChars(str2.length()-5, str2.length(), ch2Last, 0);
            String s2 = new String(ch2Last);
            System.out.println("Последние 5 символов второй строки: " +s2);
            if(s1.equals(s2)) {
                return rez=true;
            }
            return rez;
        }
    }
    static boolean equa1(String str1, String str2) {
        boolean rez = false;

        if (str1.length()>=5 && str2.length()>=5); {
            char[] ch1Last = new char[5];
            str1.getChars(str1.length()-5, str1.length(), ch1Last, 0);
            String s1 = new String(ch1Last);

            char[] ch2Last = new char[5];
            str2.getChars(str2.length()-5, str2.length(), ch2Last, 0);
            String s2 = new String(ch2Last);
            if(s1.equalsIgnoreCase(s2)) {
                return rez=true;
            }
            return rez;
        }
    }

    static boolean equa2(String str1, String str2) {
        boolean rez = false;

        if (str1.length()>=5 && str2.length()>=5); {
            char[] ch1Last = new char[5];
            str1.getChars(str1.length()-5, str1.length(), ch1Last, 0);
            String s1 = new String(ch1Last);

            if(str2.endsWith(s1)) {
                return rez=true;
            }
            return rez;
        }
    }

    static boolean index(String str1, String str2) {
        boolean rez = false;
        if (str1.indexOf("я")>-1  && str2.indexOf("я")>-1) {
            return rez=true;
        }
        return rez;
    }
}
