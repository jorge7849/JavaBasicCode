package com.syntax.class02;

public class Homework2 {

	public static void main(String[] args) {
		//task 1 
		double num1=29.99;
		double num2=50.99;
	    
		double sum, mult, sub, div;
		
	    sum=num1+num2;
	    mult=num1*num2;
	    sub=num1-num2;
	    div=num1/num2;
	    
	    System.out.println("the sum of 2 numbers "+ num1 +" and "+ num2+ " is equal to "+sum  );
	    System.out.println("the sub of 2 numbers "+ num1+ " and "+num2+ " is equal to "+sub);
	    System.out.println("the div of 2 numbers "+ num1+ " and "+num2+ " is equal to "+div);
	    System.out.println("the mult of 2 numbers "+num1+" and "+ num2+ " is equal to "+mult);
	    
	    //task 2
	    
	    
	   double num3=3.9; 
	   double num4=3.9;
	   mult=num3*num4;
	    
	   System.out.println("The square of "+num3+" is "+num3*num4 );
	   
	   //task 3
	   
	   int w=5;
	   int h=8;
	   int p=2*(w+h); 
	   
	   int a= w*h; 
	   System.out.println("the perimeter of a rectangle with width "+ w+ " and height "+h+" is equal to "+p+" and the area is "+a);

	}

}
