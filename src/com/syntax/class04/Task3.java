package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {
		
		int mortgagerate=5;
		 int mortgageprice=80000;
				 
		if(mortgagerate>4.5) {
			System.out.println("will not buy a house");
			if (mortgageprice>50000) {
				System.out.println("i will take a loan");
				}else {
					System.out.println("i will pay cash");
				}
			
		}else {
			System.out.println(" will consider buying a house");
		}
		

	}

}
