package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
	 //create an array
		
		int[] b=new int[4];
		
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from my arrays
		System.out.println(b[2]);//70
		System.out.println(b[1]+b[3]);//185
		
		//we need to create a array of my classmates names
		//when we create an array we must specify the size (how many elements)
		String[] classmates=new String[5];
		//how values are stored --> stored based on index
        classmates[0]="Khrystyna";
        classmates[1]="Zameer";
        classmates[2]="Elexia";
        classmates[3]="Oleg";
        classmates[4]="Adem";
        
        System.out.println("my classmates name is "+classmates[3]);
        
		
		
		

	}

}
