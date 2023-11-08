package com.fundamentals;

public class Test4 {
	int data = 100;
    public int getSquare(){
    	return (data*data);
    }
    
    public String getName(){
    	return "Aayush";
    }
    
    public double getArea(int radius){
    	return Math.PI*radius*radius;
    }
    
	public static void main(String[] args) {
		Test4 t = new Test4();
		int result = t.getSquare();
		System.out.println(result);
		
		String name = t.getName();
        System.out.println(name);
        
        double area = t.getArea(10);
        System.out.println(area);
	}

}
