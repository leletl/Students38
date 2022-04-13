package com.belhard.lesson5_HW.task5_3;

public class Task5_3 {

    public static void main(String[] args) {
        int [] array = new int[118];
        //int [] prime=new int[117];
        //	int count = 0;
        //не разобрался как вставить полученные значения в новый массив (массив не простых чисел)
        int z = 0;
        boolean check1=false;
        for (int i=0; i<array.length; i++) {
            array[i]=i+3;
            z=array[i];
            //System.out.print(array[i]+" ");
            for (int j = 2; j<z; j++) {
                if(z%j==0) {
                    check1=true;
                    break;
                } {check1=false;}
            }
            if (check1) {
                System.out.print(array[i]+" ");
            }

        }

    }



}