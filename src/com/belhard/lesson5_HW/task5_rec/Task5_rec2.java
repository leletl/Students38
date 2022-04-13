package com.belhard.lesson5_HW.task5_rec;

public class Task5_rec2 {
    public static void main(String[] args) {
        //ars(19);
        System.out.print(ars(1634));
    }
    public static int ars (int n) {
        int rez = 0;
        if ( n/1000<10) {
            rez=n/1000+(n%1000)/100+(n%1000%100)/10+((n%1000%100%10));
            //не знаю как реализовать рекурсию здесь.
        }
        return rez;



    }

}