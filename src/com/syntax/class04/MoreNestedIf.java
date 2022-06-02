package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/*
		 * we need to check if repl was completed
		 * if repl is completed we want to see
		 * if you did 15 and more-->great job
		 * if you did more than 10---> did good
		 * if less than 10-->try to complete all  assignment
		 * 
		 */
		
		
		boolean didrepl=true;
		int assignment;
		
		if (didrepl) {
			System.out.println("how many assignment have you done ");
			assignment=14;
			
			if(assignment>15) {
				System.out.println("you did a great job");
			}else if (assignment>10) {
				System.out.println("you did a good job");
			}else {
				System.out.println("please complete all repl assignment");
			}
			
		}else {
			System.out.println("you should complete your repl HW ");
		}
		

	}

}
