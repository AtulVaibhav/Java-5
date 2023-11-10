//WAP to print a given number is positive or negative.
package com.decision_control_statements;

public class Problem2 {
    public static void isPositiveOrNegative(int num){
    	if(num>0){
    		System.out.println(num+":positive number");
    	}else{
    		System.out.println(num+" :negative number ");
    	}
    }
	public static void main(String[] args) {
		Problem2.isPositiveOrNegative(-9);

	}

}
