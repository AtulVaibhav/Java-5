package com.decision_control_statements;
//WAP to find the factorial of number
public class Problem5 {
   public static void fact(int num){
	   int result=1;
	   for(int i=1;i<=num;i++){
		  result = result*i;
	   }
	   System.out.println("Factorial of "+num+" ="+result);
   }
	public static void main(String[] args) {
		Problem5.fact(5);

	}

}
