package com.belhard.lesson6;

public class Main {
    public static void main(String[] args) {
        String[] mas = {"I", "java", "love"};
        String buf = mas[2];
        mas[2] = mas[1];
        mas[1] = buf;
        System.out.println(N1(mas));
        System.out.println(N2(mas));
//        System.out.println(N3(mas));
        String izvl1 = "I love java";
        String izvl2 = "skoro stanu programmistom";
      //  iz1(izvl1);
    }

    private static String N1(String[] mas) {
        String str = mas[0] + " " + mas[1] + " " + mas[2];
        return str;
    }

    private static String N2(String[] mas) {
        String str = mas[0].concat(" ").concat(mas[1]).concat(" ").concat(mas[2]);
        return str;
    }

//        private static String N3(String[] mas) {
//            String str = String.join(" ", mas);
//            return str;
//        }


}


