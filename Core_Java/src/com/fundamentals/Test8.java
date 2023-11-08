package com.fundamentals;
//this keyword

class Car2{
	Car2(){
		System.out.println("value of this keyword:"+this.hashCode());
	}
}
public class Test8 {

	public static void main(String[] args) {
		Car2 c = new Car2();
		System.out.println("value of c:"+c.hashCode());

	}

}
