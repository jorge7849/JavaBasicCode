package com.syntax.reviewclass3;

public class IfElse3 {

	public static void main(String[] args) {
		// multiple if else if condition result in same
		//output then we can replace if else if condition with
		//logical || operator
		String country="Turkey";
		
		if("Turkey".equals(country)) {
			System.out.println("Ankara");
		}else if("usa".equals(country)) {
			System.out.println("DC");
		}else if("Serbia".equals(country)) {
			System.out.println("Begrade");
		}else if("Albania".equals(country)) {
			System.out.println("Tirana");
		}else if("Afghanistan".equals(country)) {
			System.out.println("Kabul");
		}else if("pakistan".equals(country)) {
			System.out.println("Islamabad");
		}
		
		
		
		
		
	}

}
