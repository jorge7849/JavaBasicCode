package com.syntax.class02;

public class NonPrimitive {

	public static void main(String[] args) {
		
		String name="Oleg";
		
	    String lastName="Smith";
	    
	    long phone=1234567890l;
	    
	    //xxx-xxx-xxxx
	    
	    String phoneNumber="123-456-7890";
	    String Address= "123 Washington St";
	    
	    int age =30;
	    String city="Miami";
	    // shortcut for printing
	    // syso+ctrl+space then enter
	    
	    /*
	     * we can use + to attach String to String
	     */
	    
	  System.out.println(name+" "+lastName);
	  
	  //oleg lives in miami
	  
	  System.out.println(name+" lives in "+city);
	  
	  //oleg is 30 years old
	  System.out.println(name+" is "+age+" years old ");
	  
	  /*
	   * rules for identifier
	   * 1. no space
	   * 2. no keywords
	   * 3. cannot start with numbers(numbers can be used after the 
	   * 4. cannot have with special character(except _, $
	   */
	  
	  //String break="hello"; error
	 
	  //int 1number=10 error
	  int number1=10;
	  
	  //int num%=20; error
	  
	  double $price=3.99;
	  float f_=2.09f;
	  
	  /*
	   * Naming convention:
	   * follow camel casing
	   * variable names should start with lowercase and then follow camel casing
	   * class names should start with uppercase 
	   * 
	   */
	  
	  String mycity="tysons";
	  
			  
			  
	  
	  

	}

}
