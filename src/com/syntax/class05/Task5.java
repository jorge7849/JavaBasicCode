package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("is it weekend or weekday");
        int d=scan.nextInt();
        
        if(d>=1&&d<=5) {
        	System.out.println("It is a weekday");
        }else if(d>=6&&d<=7) {
        	System.out.println("it is weekend");
        }else {
        	System.out.println("invalid day");
        }
	}

}
