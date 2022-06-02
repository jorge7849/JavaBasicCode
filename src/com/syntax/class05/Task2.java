package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("do you have a credit card ");
		String answer=scan.next();
		
		if(answer.equals("no")) {
			System.out.println("we will offer you a credit card");
		}else {	
		System.out.println("what is balance on card");
		int balance =scan.nextInt();
		
		if(balance>=1000) {
			System.out.println("pay off immediately");
		}else {
			System.out.println("you can spend more ");
		}
	   
	
		
	}
	}
}
