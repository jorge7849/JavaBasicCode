package com.syntax.reviewclass3;

public class SwitchDemo1 {

	public static void main(String[] args) {
		String country="Turkey";
		
		switch(country){
		
		case"Turkey":
			System.out.println("Ankara");
			break;
		case"USA":
			System.out.println("DC");
			break;
		case"serbia":
			System.out.println("begrade");
			break;
		case"albania":
			System.out.println("tirana");
			break;
		case"afghanistan":
			System.out.println("kabul");
			break;
		case"pakistan":
			System.out.println("islamabad");
			break;
			default:
				System.out.println("not a valid country");
			
		}

	}

}
