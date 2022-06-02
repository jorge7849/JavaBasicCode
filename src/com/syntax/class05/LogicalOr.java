package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*tuesday and wednesday--> Manual testing
		 * Thursday--> review
		 * saturday and sunday-->java
		 * monday and friday--->no class
		 */
		
		String day="saturday";
		
		if(day.equals("mondays")|| day.equals("fridays")) {
			System.out.println("i have no class");
		}else if (day.equals("Tuesday")|| day.equals("wednesday")) {
			System.out.println("i have a manual testing class");
			
		}else if(day.equals("thursday")) {
			System.out.println("i have review class ");
		}else if(day.equals("saturday")|| day.equals("sunday")) {
			System.out.println("i have a java class");
		}

	}

}
