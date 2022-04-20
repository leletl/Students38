package com.belhard.lesson7;

public class Task13 {

    public static void main(String[] args) {
        String str1 = "25+40=65";
        sb1(str1);
        StringBuilder sb = new StringBuilder(str1);
        System.out.print(sb2(sb));
    }

    static void sb1(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        sb.deleteCharAt(5);
        sb.insert(5, " равно ");
        System.out.println(sb);
    }

    static StringBuilder sb2(StringBuilder sb) {
        sb.replace(5, 6, " равно ");
        return sb;
    }
}
