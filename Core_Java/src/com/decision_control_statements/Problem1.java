//WAP to check user is eligible to vote or not.
package com.decision_control_statements;

public class Problem1 {
    public static void checkAge(int age){
    	if(age>=18){
    		System.out.println("User is allowed");
    	}else{
    		System.out.println("User is not allowed");
    	}
    }
	public static void main(String[] args) {
		Problem1.checkAge(20);

	}

}
