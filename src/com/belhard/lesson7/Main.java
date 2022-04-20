package com.belhard.lesson7;

public class Main {
    public static void main(String[] args) {
        String str1 = "Я изучаю java";
        String str2 = "скоро стану программистом";
        String str1_2 = Character.toString(t2_1(str1));
        String str2_2 = new String (t2_2(str2));
        String strTask2Fin = str1_2.concat(" ").concat(str2_2);
        System.out.print(strTask2Fin);
    }
    public static char t2_1(String str1) {
        char first = str1.charAt(0);
        return first;
    }
    public static char [] t2_2(String str2) {
        char [] second = new char[19];
        str2.getChars(6, 25, second, 0);;
        return second;
    }

}