package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice='y';
		String meaning;
		
		//variable and matching cases must be of same type
		switch(choice) {
		
		case 'y':
			meaning="yes";
			break;
		case 'm':
			meaning="maybe";
		case 'n':
		    meaning="no";
             break;		
		 default:
			 meaning="unknown";
		    
		}
         System.out.println(meaning);
	}

}
