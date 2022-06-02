package com.syntax.reviewclass3;

public class IfElse {

	public static void main(String[] args) {
		// when code execute but does not produce expected results we call these mistake logical errors
      //
		String user="Asghar";
		String password="pass123";
		// when ever we use primitive like byte short int long float boolean char double
		//we use ==
		//whenever we use non primitive(String) dataypes we use .equals method
		if(user.equals("Asghar")&& password.equals("pass123")) {
			System.out.println("welcome back to syntax");
		}else {
			System.out.println("username or password is not correct");
			
		}
		
		
		//when debugging make sure you have not disable the breakpoint
		//you have not enabled the skip all breakpoints option in debug window
	}

}

