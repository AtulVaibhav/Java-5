package com.fundamentals;
//case 1:solve the naming confliction when
//name of instance variable and constructor variable are same

class Vehicle {
	int numberOfWheels;
	String name;
	
	Vehicle(int numberOfWheels,String name){
		this.numberOfWheels = numberOfWheels;
		name = name;
	}
	public void display(){
		System.out.println("Wheels :"+numberOfWheels);
		System.out.println("name :"+name);
	}
}


public class Test9 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(4,"Santro");
		v.display();

	}

}
