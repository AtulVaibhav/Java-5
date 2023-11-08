package com.fundamentals;
/**
 * Types:
 * 1.Default-constructor (No-arg constructor)
 * 2.Parameterized constructor
 * 3.CopyConstructor
 * 
 *
 */

class Employee{
	int empId ;
	String empName;
	
	Employee(int id,String name){
		empId =id;
		empName = name;
	}

	public void display(){
		System.out.println("EmpId :"+empId+" EmpName:"+empName);
	}
}

public class Test6 {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Harsh");
		Employee emp1 = new Employee(102,"Amit");
		
		System.out.println("Details of first emp:");
		emp.display();
		System.out.println("___________________________");
		System.out.println("Details of second emp:");
		emp1.display();
         
	}

}
