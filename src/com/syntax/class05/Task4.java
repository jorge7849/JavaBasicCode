package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		
		if(number>=1&&number<=10) {
			System.out.println("small");
			
		}else if (number>=11&&number<=100) {
			System.out.println("medium");
		}else if (number>=101&&number<=1000) {
			System.out.println("large");
		}

	}

}
