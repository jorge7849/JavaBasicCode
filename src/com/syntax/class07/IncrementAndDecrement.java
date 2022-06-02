package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x=10;
		
		x=x+1;
		
		x+=1;
		
		System.out.println(x);//12
		
		x++;//increment value of a variable by 1
		System.out.println(x);//13
		
		x--;//decrement value of a variable by 1 
		System.out.println(x);//12
		
		//increment and decrement operator work only with variable
		//10++; CE invalid argument to operation ++/--
		
		int num=100;
		num++;
		System.out.println(num);
				
				
				
				
	}

}
