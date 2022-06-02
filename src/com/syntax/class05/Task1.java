package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your age");
		int age=scan.nextInt();
		
	 if(age>18) {
		 System.out.println("you will get a driver license");
	 }else {
		 
	   System.out.println("you will get a permit");
	 }
		
         
	}

}
