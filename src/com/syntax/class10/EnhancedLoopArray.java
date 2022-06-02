package com.syntax.class10;

public class EnhancedLoopArray {

	public static void main(String[] args) {
		
		/*
		 *enhanced for loop uses variables to access elements from an array
		 *outer for loops -> iterates over 1D array
		 *inner loop -> iterates over elements of each 1D array
		 */
		
		int[][] num= {	
				{1, 2, 3, 4, 5},
				{199, 300, 588},
				{1900, 4578, 98787}				
		};
		
		for(int[] num1:num) {
			
			for(int n:num1) {
				
				System.out.print(n+" ");
			}
			System.out.println();
		}
	
			
			
		
			
			
			
		

	}
}
