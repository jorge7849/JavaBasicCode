package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextInt();
		double y = scan.nextInt();
		double result;
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		
		double result1=0;
		String operator=null;
		
        switch (op) {
	    case '*':
			result1 = x * y;
			break;
		case '/':
			result1 = x / y;
			break;
		case '+':
			result1 = x + y;
			break;
		case '-':
			result1 = x - y;
			break;
		default:
			System.out.println("invalid operator");
			operator="invalid";
		}
		
        if(result1 !=0 || operator==null) {
        System.out.println(x + " " + op + " " + y + " = " + result1);
        }
		
		scan.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
