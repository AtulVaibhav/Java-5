package com.decision_control_statements;
/*
 * if(condition1){
 * }else if(condition2){
 * }else if(condition3){
 * }else{
 * 
 * }
 * 
 * 
 * 
 */
public class Test4 {
    public static void checkMarks(int marks){
    	if(marks>=80){
    		System.out.println("Distinction");
    	}else if(marks>=60 && marks<80){
    		System.out.println("First class");
    	}else if(marks>=40 && marks<60){
    		System.out.println("Second class");
    	}else{
    		System.out.println("Try Again");
    	}
    }
	public static void main(String[] args) {
		Test4.checkMarks(35);

	}

}
