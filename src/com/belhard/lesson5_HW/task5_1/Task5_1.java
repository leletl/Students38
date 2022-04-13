package com.belhard.lesson5_HW.task5_1;
import java.util.Random;
public class Task5_1 {

    public static void main(String[] args) {
        int [] array = new int[7];
        Random rand = new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = rand.nextInt(150);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int max=array[0];
        int min=array[0];
        double sum=0;
        double average = 0;
        for (int i=0; i<array.length;i++) {
            if(array[i]>max) {
                max= array[i];
            }
            if(array[i]<min) {
                min=array[i];
            }
            sum+=array[i];
            //average+=array[i]/array.length;

        }
        average=sum/array.length;
        System.out.println("Maximim value is "+ max);
        System.out.println("Minimum value is "+ min);
        System.out.printf("Average value is "+"%.2f",average);
    }
}
