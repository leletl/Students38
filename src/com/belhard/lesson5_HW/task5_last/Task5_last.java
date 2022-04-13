package com.belhard.lesson5_HW.task5_last;

public class Task5_last {
    public static void main(String[] args) {
        System.out.println(sqr(20));
        System.out.println("Square of circle = "+ sqr(20, false));
    }
    static double sqr(int x) {
        return x*x*3.14;
    }
    static double sqr(int x, boolean y) {
        double t=0;
        if (y==true) {t=((x*x)/4)*3.14;}
        else{t=(x*x)/(4*3.14); }
        return t;
    }

}