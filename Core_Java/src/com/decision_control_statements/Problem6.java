package com.decision_control_statements;
//Design Pattern programs
public class Problem6 {
    public static void rightAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=1;j<=i;j++){
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    
    public static void leftAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=i;j<num;j++){
    			System.out.print("   ");
    		}
    		for(int k=1;k<=i;k++){
    			System.out.print(" * ");
    		}
    		
    		System.out.println();
    	}
    }
    
    public static void reverseRightAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=num;j>=i;j--){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    public static void reverseleftAngledTriangle(int num){
    	for(int i=1;i<=num;i++){
    		for(int j=1;j<i;j++){
    			System.out.print("   ");
    		}
    		for(int k=num;k>=i;k--){
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		//Problem6.rightAngledTriangle(5);	
		//Problem6.leftAngledTriangle(5);
		//Problem6.reverseRightAngledTriangle(5);
		Problem6.reverseleftAngledTriangle(5);

	}

}
