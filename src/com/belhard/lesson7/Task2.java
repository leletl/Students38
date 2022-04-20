package com.belhard.lesson7;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "My name is Alex";

        String str2 = str1.replace(" ", "");
        System.out.println("Без пробелов - " + str2);

        String[] str4 = str1.split(" ");
        System.out.println("Количество слов в строке = " +str4.length);

        String str3 = str1.toLowerCase();
        char [] chStr1 = new char [str3.length()];
        str3.getChars(0, str3.length(), chStr1, 0);
        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            for (int j = 0; j<chStr1.length; j++) {
                if (chStr1[j] == i) {
                    count ++;
                }
            }
            if (count>0) {
                System.out.println (i + " - " +count);
            }
        }

        //reverse№1
        for (int i=chStr1.length-1; i>=0; i--) {
            System.out.print(chStr1[i]);
        }
        System.out.println();

        //reverse№2
        StringBuilder sb = new StringBuilder (str1);
        sb = sb.reverse();
        System.out.println (sb);

        //reverse№3
        String rezult = "";
        for (int i=0; i<str1.length(); i++) {
            rezult = str1.charAt(i)+rezult;
        }
        System.out.println(rezult);
    }
}
