package com.decision_control_statements;
/*
 * if(condition){
 *    code;
 * }else{
 *  code
 * }
 * condition is true: if block will execute
 * otherwise,else block will execute
 * 
 */
public class Test1 {
    public static void greaterNumber(int a,int b){
    	if(a>=b){
    		System.out.println(a+" is greater");
    		System.out.println("if block executed");
    	}else{
    		System.out.println(b+" is greater");
    		System.out.println("else block executed");
    	}
    }
    	public static void main(String[] args) {
		Test1.greaterNumber(9, 9);

	}

}
