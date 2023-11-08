package com.fundamentals;

//copy constructor
class Car{
	int numberOfWheels;
	String carName;
	Car(int wheels,String name){
		numberOfWheels = wheels;
		carName = name;
	}
	Car(Car obj){
		numberOfWheels =obj.numberOfWheels;
		carName = obj.carName;
	}
	
	public void show(){
		System.out.println("Wheels :"+numberOfWheels);
		System.out.println("Name :"+carName);
	}
}
public class Test7 {

	public static void main(String[] args) {
		Car car1 = new Car(4,"santro");
		car1.show();
		Car car2 = new Car(car1);
		car2.show();
	}

}
