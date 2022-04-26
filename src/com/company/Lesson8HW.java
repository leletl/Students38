package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lesson8HW {
	public static void main(String[] args) {
		ArrayList <Integer> array = new ArrayList<>();
		LinkedList <Integer> linked = new LinkedList<>();
		addList(array,linked);
	}
	
	

	public static void addList(ArrayList <Integer> array, LinkedList <Integer> linked) {
		int randInt = 0;
		for (int i = 0; i<100000; i++) {
		randInt = (int) (Math.random()*10000);
		array.add(randInt);
		linked.add(randInt);
		}
		//System.out.println(array);
		arrayTest(array);
		linkedTest(linked);
		
	}

	public static void arrayTest (ArrayList<Integer> array) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
		array.get((int) (Math.random()*100000));
		}
		long processTime = System.currentTimeMillis()-startTime;
		System.out.println(processTime);
		
	}
	
	public static void linkedTest (LinkedList <Integer> linked) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			linked.get((int) (Math.random()*100000));
			}
		long processTime = System.currentTimeMillis()-startTime;
		System.out.println(processTime);
		
	}
}