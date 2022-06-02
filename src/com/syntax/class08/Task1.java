package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("guess the secret number");
		int number=scan.nextInt();
		
		while(number!=23) {
			System.out.println("guess the secret number");
			number=scan.nextInt();
		}System.out.println("You got it!");

	}

}
