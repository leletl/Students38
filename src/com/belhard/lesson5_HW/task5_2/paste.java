package com.belhard.lesson5_HW.task5_2;

import java.util.Random;

public class paste {
    public static void main(String[] args) {

            int [] array = new int[10];
            Random rand = new Random();
            for (int i=0; i<array.length; i++) {
                array[i] = rand.nextInt(150);
                System.out.print(array[i]+" ");
            }
        for (int i = 0; i < array.length ; i++) {
            int current = array[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if(current<array[j]) {
                    array[j+1]=array[j];
                } else {
                    break;
                }
            }
            array[j+1]=current;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

