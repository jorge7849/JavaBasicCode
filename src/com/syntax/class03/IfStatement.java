package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * declare a variable rate.
		 * if rate is more than 5--> I am not buying a house 
		 * 
		 */

	     double mortgagerate=4.5;
	     
	     if (mortgagerate>5) {
	    	 System.out.println("i am not buying a house");
	     }
	
	     /*
	      * declare 2 variables and check if num1 is bihggers than num2
	      * 
	      */
	     int num1=99;
	     int num2=10;
	     if (num1>num2) {
	    	 
	    	 System.out.println(num1+" is bigger than "+num2);
	     }
	    /*
	     * declare temperature, if temp is higher than i will go for a walk
	     * 
	     */
	     
	     int temp=68;
	     
	     if (temp>75) {//when condition is true
	    	 
	    	 System.out.println("i will go for a walk");
	     } else {//whe condition is false
	    	 System.out.println("i am going to study java");
	     }
	   System.out.println("-------------------- ");
	   
	   char gender='f';
	   
	   if(gender=='m') {
		   System.out.println("you like shopping");
		   
	   }else {
		   System.out.println("you like watching sports");
	   }
	   
	   System.out.println("-----------------------------");
	   
	   String browser="chrome";//if change to Chrome it will go to else
	   
	   if (browser.equals("chrome")) {
		   
		   System.out.println("all test cases will be executing on chrome");
	   }else { 
		   System.out.println("i am not executing any test casses");
	   }
	   //without braces java can only do 1 statement
	   
	   //when using string have to type equals.
	   String yime="morning";
	   if(yime.equals("morning")) {
		   
		   
	   }
	   
	   
	    
	
	}

}
