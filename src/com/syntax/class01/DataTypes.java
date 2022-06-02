package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		// to create a variable: datatype name
		//whole numbers
		/*
		 * box1= is variable
		 * to create a variable we need 2 things: datatype and name
		 */
		byte box1=127;
		short box2=2022;
		int box3=76666; // mostly will be used
	    long box4=45678909876543L;
	    
	    //decimal numbers
	    float container1=1.99F;
	    double container2=89.99;
	    
	    
	    // to represent 1 character 
	    char gender='m';
	    char dollar='$';
	    
	    // to represent true or false (yes or no)
	    
	    boolean hungry=true;
	    boolean sleepy=false;
	    
	    //how to access values from variables?
	    
	    System.out.println(container2);//do not use "" to access variables
	    
	    // access and print values from all variables
	    System.out.println(container1);
	    System.out.println(sleepy);//false
	    System.out.println(hungry);
	    System.out.println(dollar);
	    System.out.println(gender);
	    System.out.println(box1); // calling a variable box1
	    System.out.println(box2);
	    System.out.println(box3);
	    System.out.println(box4);
	    
	    // system.out.println(box5); this line will give error 
	    int box5=900;
	    System.out.println(box5);
	    
	    int year=2022; // create a variable and store value
	    System .out.println(year);//2022
	   
	    year =2023; // reassigning the value of the same box 
	    System .out.println(year);//2023	
	    

		
		
	}

}
