package com.belhard.lesson5_HW.task5_rec;

public class Task5_rec1 {
    public static void main(String[] args) {
        //ars(19);
        System.out.print(ars(19));
    }
    public static int ars (int n) {
        if (n==1) {
            return n;
        }

        System.out.print(n+ " ");
        return ars(n-1);

    }
}
