package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		int secretnum=25;
		int guessednum;
		
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("guess my secret number");
		guessednum=scan.nextInt();
		}while(guessednum != secretnum);
		System.out.println("you go it!");
	

	}

}
