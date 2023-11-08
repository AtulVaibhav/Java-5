package com.fundamentals;
//varible: named memory location
//instance variable
// objectName.variableName
// static Variable: className.variableName
//local variable: variable defined inside a method



public class Test2 {
    int a = 10;//instance variable
    static float b = 20.45f;  //static variable
    
    public void m1(){
    	int c = 2000;
    	System.out.println(c);
    }
    
	public static void main(String[] args) {
		//ClassName nameOfObj = new ClassName();
		Test2 t = new Test2();
		//System.out.println(t.a);
		
		Test2 t1 = new Test2();
		//System.out.println(t1.a);
		
		t.a = 20;
		System.out.println(t.a);
		System.out.println(t1.a);
		
		System.out.println(Test2.b);
		
		
		t.m1();
		
		
		
		

	}

}
