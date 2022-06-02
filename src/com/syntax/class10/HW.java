package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		
		double[] num= {2.99, 3.99, 4.99, 5};
		
		for(double x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
 
	}

}
