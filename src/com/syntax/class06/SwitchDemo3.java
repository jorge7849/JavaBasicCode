package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*
		 * lets ask user where hes from
		 * based on the country we will define favorite food
		 */
        
		Scanner scan=new Scanner(System.in);
		String country, favoritefood;
		
		System.out.println("please tell me where are you from");
	     country=scan.nextLine();
	     
	     switch(country) {
	     
	     case "mexico":
	    	 favoritefood="tacos";
	    	 break;
	     case "canada":
	    	 favoritefood="poutine";
	    	 break;
	     case "turkey":
	    	 favoritefood="lahmacun";
	    	 break;
	     case "pakistan":
	    	 favoritefood="pati chai";
	    	 break;
	     case "egypt":
	    	 favoritefood="koshary";
	    	 break;
	     case "usa":
	    	 favoritefood="burgers";
	    	 break;
	     default:			 
	    	 favoritefood="unknown";
	    	 
	   }
		System.out.println("you are from "+ country+" and your favorite food is "+ favoritefood);
		
		
	}

}
