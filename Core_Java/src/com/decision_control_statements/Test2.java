package com.decision_control_statements;
/*
 * if(condition){
 *    if(condition2){
 *      code
 *    }else{
 *    code
 *    }
 *
 * }else{
 * code
 * }
 * 
 * 
 * 
 */
//WAP to check the number is positive even number
public class Test2 {
    public static void checkNumber(int num){
    	if(num>0){
    		if(num%2==0){
    			System.out.println("Number is positive even number");
    		}else{
    			System.out.println("Number is positive odd number");
    		}
    	}else{
    		System.out.println("Number is negative");
    	}
    }
	public static void main(String[] args) {
		Test2.checkNumber(3);

	}
                                         
}
