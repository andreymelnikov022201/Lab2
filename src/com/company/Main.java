package com.company;

import java.util.Arrays;


public class Main {

	public static void main(String[] args)  {
		//Task1
		Student student1 = new Student("Ваня");
		int age;
		age = student1.setAge(14);
		System.out.println("age = " + age);
		// Task 2створюємо масив об'єктів
		Task2[] empArr = new Task2[4];
		empArr[0] = new Task2("Andrew",10);
		empArr[1] = new Task2("Viktor", 49);
		empArr[2] = new Task2("Lena", 45);
		empArr[3] = new Task2("Alex", 42);
		Arrays.sort(empArr, Task2.AgeComparator);
		System.out.println("Сортування по віку:\n"+Arrays.toString(empArr));
		//Task4
		final int i ;
		i = 10;
		i;
		Main.one(0);
	}
	static void one(int par){
		System.out.println(par>2?"Yes":"No");
	}
}
