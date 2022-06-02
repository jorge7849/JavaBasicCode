package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<6; i++) {
			System.out.println(sum+" ");//0 1 3 6 10 
			sum+=i;
			//System.out.print(sum+" ");//1 3 6 10 15
		}
		System.out.println("------------------------");
		int sum1=0;
		for(int i=1; i<=70; i++) {
			sum1+=i;
			System.out.print(sum1+" ");
		}
		System.out.println("----------------------");
		int sumEven=0;
		int sumOdd=0;

		for (int i = 1; i <= 70; i++) {

		if (i % 2 == 0) {
		sumEven+=i;
		}else {
		sumOdd+=i;
		}
		}

		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
			
		
	}

}
