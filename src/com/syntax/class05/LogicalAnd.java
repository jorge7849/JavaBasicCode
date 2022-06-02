package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean job=true;
		double salary=100000;
		
		if(job &&  salary>=100000) {
			System.out.println("i am super duper happy");
		}
		System.out.println("------------------------");
		
		boolean study=false;
		boolean homework=true;
		boolean practice=true;

		if(study && homework && practice) {
			System.out.println("you will succeed in the course");
			
		}else {
			System.out.println("you will struggle");
		}
		System.out.println("-------------------");
		
	}

}
