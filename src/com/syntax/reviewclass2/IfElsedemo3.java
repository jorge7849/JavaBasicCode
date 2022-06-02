package com.syntax.reviewclass2;

import java.util.Scanner;

public class IfElsedemo3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your account balance");
		double accountbalance=scanner.nextDouble();
		System.out.println("please enter the amount you want to lend to your friend");
		double amounttolend=scanner.nextDouble();
		
		if(accountbalance>=amounttolend) {
			System.out.println("yes i can help you");
		}else {
			System.out.println("sorry i dont have money to help you ");
		}
		
		

	}

}
