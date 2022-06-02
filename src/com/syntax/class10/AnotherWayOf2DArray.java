package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		// create 2d array of states
		/*
		 * 1 array-->NY-->all cities of NY state
		 * 1 array-->CA-->all cities of CA sates
		 * 1 array-->FL-->all cities of FL states
		 * 1 array-->VA-->all cities of VA states
		 */
		
		String[][] usa= {
				
		{"New York", "Albany", "Buffalo"},
		{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
		{"Miami", "Orlando", "Niceville", "Tampa"},
		{"mcLean", "Richmond", "Leesburg"}
				
				
				
		};
       System.out.println(usa[1][2]);//san jose
       System.out.println("I want to go to "+usa[2][0]);//miami
       
       System.out.println("Total # of 1d arrays in array usa = "+usa.length);
       //i want to see how many element inside my first array
       int elem1array=usa[0].length;
       System.out.println("# of elements in 1 array = "+elem1array);
       
       //i want to see how many elements in 2nd array
       int elem2array=usa[1].length;
       System.out.println("# of elements in 2 array = "+elem2array);
	}

}
