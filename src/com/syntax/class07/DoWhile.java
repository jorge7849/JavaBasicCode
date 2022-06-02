package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		//while loop first checks condition
		//and only then executes block of code
		
		int num=10;
		
		while(num<=3) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println("--------------------");
		//do while first execute the code
		//and only then checks the condition
		
		int num1=1;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1<=3);
		
		
		//print numbers 1 to 30 using do while
		int num2=1;
		do {
			System.out.print(num2+" ");
			num2++;
		}while(num2<=30);
		
		System.out.println("----------------------");
		
		int c=70;
				do {
					System.out.print(c+" ");
					c-=2;
				}while(c>=30); 
		
		
		
		

	}

}
