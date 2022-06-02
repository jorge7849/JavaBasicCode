package com.syntax.class10;

public class AllElemtsFrom2DArray {

	public static void main(String[] args) {
		String[][] usa= {
				
	{"New York", "Albany", "Buffalo"},
	{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
	{"Miami", "Orlando", "Niceville", "Tampa"},
	{"mcLean", "Richmond", "Leesburg"}
						
						
						
		};
         //outer loop iterates over rows
		//inner loop iterates over columns
		for(int rows=0; rows<usa.length; rows++) {
			
			for(int col=0; col<usa[rows].length; col++ ) {
				
				System.out.print(usa[rows][col]+" ");
			}
			System.out.println();
		}
     for(String[] state:usa) {
    	 for(String city:state) {
    		System.out.print(city+" "); 
    	 }
     }
	}

}
