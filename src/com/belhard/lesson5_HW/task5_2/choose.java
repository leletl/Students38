package com.belhard.lesson5_HW.task5_2;

import java.util.Random;

public class choose {

    public static void main(String[] args) {
        int [] array = new int[10];
        Random rand = new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = rand.nextInt(150);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0; i<array.length; i++) {
            int min=array[i];
            int min_i=i;
            for (int j=i+1; j<array.length; j++) {
                if(array[j]<min) {
                    min=array[j];
                    min_i=j;
                }
            }
            if(i!=min_i) {
                int buf = array[i];
                array[i]=array[min_i];
                array[min_i]=buf;

            }
        }
        for (int j=0; j<array.length; j++) {
            System.out.print(array[j]+" ");
        }
    }
}
