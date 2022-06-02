package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name=scanner.nextLine();
		
		System.out.println("please enter your age");
		int age=scanner.nextInt();
		System.out.println(name+age+" where this will be printed");

	}

}
