package com.fundamentals;
//Method: block of code to perform some task
//Non-static method :object.nameofMethod
//Static Method : ClassName.nameOfMethod

//Syntax: accessModifier(public) returnType(void) fn(arg-list){}




public class Test3 {
	
	//Non-static method:
	public void m1(){
		System.out.println(11+12);
	}
	
	public void m2(int a,int b){
		System.out.println(a+b);
	}
	
	//static method:
	public static void m3(){
		System.out.println("Hello from static method");
	}
	

	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.m1();
        obj.m2(10, 10);
        
        //calling a fn
        Test3.m3();
	}

}
