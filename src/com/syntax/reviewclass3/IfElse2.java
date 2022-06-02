package com.syntax.reviewclass3;

public class IfElse2 {

	public static void main(String[] args) {
		//in non primitive type variables we can store null which means nothing
		String day="Friday";
		if(day.equals("Monday")||"tuesday".equals(day)||"wednesday".equals(day)||"thursday".equals(day)||"friday".equals(day)) {
			System.out.println("weekday");
			

		}else if("saturday".equals(day)||"sunday".equals(day)) {
			System.out.println("weekend");
		}else {
			System.out.println("invalid" );
		}
		
		
		
		
		

	}

}
