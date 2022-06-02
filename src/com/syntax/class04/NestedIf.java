package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		
		if(vaccine) {
		int dose=2;	
			System.out.println("let me check how many doses you have ");
			if (dose==1) {
				System.out.println("you need 1 more shot ");
			}else {
				System.out.println("you are fully vaccinated");
			}
		}
        
		String month="june";
		int day=19; 
		
		if (month.equals("May")) {
			System.out.println("let me check what is today date ");
			
			if (day==8) {
				System.out.println("today is mother day ");
			}
		} else if (month.equals("june")) {
			System.out.println("let me check what is today date ");
			if (day==19) {
				System.out.println("today is father day");
			}
		}
		
		
	}

}
