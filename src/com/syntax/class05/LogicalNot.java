package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * if theres no traffic--> i will reach work on time
		 * not false reverse to true
		 * not true reverse to false
		 */
		
		boolean traffic=false;
		
		if(!traffic) {//not false reverse to true
			System.out.println("i will reach work on time");
		}

	}

}
