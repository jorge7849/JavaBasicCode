package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {
		
		char[] grade= {'A', 'B', 'C', 'D',};
		
		for(int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
       
       
       System.out.println();
       
       String[] words= {"java", "saturday", "day"};
       
       for(int i=0; i<words.length; i++) {
    	   System.out.print(words[i]+" ");
       }
       System.out.println();
       /*
        * Enhanced for loop/advanced for loop/ for each loop
        * CAN ONLY BE USED WHEN WE WORK WITH ARRAYS or COLLECTION
        */
       String[] colors= {"pink", "blue", "white", "black"};
       for(String color:colors) {
    	   System.out.print(color+" ");
       }
       System.out.println();
       
       int[] numbers= {10, 20, 30, 40};
       for(int num:numbers) {
    	   System.out.print(num+" ");
       }
       
       
	}

}
