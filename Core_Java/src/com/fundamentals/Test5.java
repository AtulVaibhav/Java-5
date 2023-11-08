package com.fundamentals;
/*
 * constructor:special function
 * name of this fn matches with the name of className
 * this fn doesn't has return type not even a void
 * Constructors are used to instantiate(creating an object) a class
 * 
 */

class Student{
	Student(){
		System.out.println("Object created");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Student s1 =  new Student();

	}

}
