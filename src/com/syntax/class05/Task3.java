package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("persons height in inches ");
	         int height=scan.nextInt();
	         
	         if(height<60) {
	        	 System.out.println("short");
	         }else if (height>=60&& height<=72) {
	        	 System.out.println("medium");
	         }else if(height>72) {
	        	 System.out.println("tall");
	        	 
	         }
	}

}
