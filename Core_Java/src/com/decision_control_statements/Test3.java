package com.decision_control_statements;

public class Test3 {
    public static void login(String username,String password){
    	if(username.equals("admin")){
    		if(password.equals("admin")){
    			System.out.println("Welcome Admin");
    		}else{
    			System.out.println("Wrong Password");
    		}
    	}else{
    		System.out.println("Invalid Username");
    	}
    }
	public static void main(String[] args) {
	  Test3.login("admin","admin");
	  //passing invalid password:
	  Test3.login("admin","123");
	  
	  //Passing wrong username
	  Test3.login("123", "admin");

	}

}
