package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		String[] disney= {"shrek ", "elsa ", "goofy ", "mulan", "tom&jerry"};
		
		System.out.print(disney[1]);//elsa
		System.out.print("all elements using regular for loop-----");
		//to get all element from array
		
		for(int i=0; i<disney.length; i++) {
			if(disney[i].equalsIgnoreCase("shrek")) {
			System.out.print(disney[i]+" is my favorite character");
		}else{
			System.out.print(disney[i]+" ");
		}
		
		System.out.println("all elements using regular for loop-----");
		
		for(String character:disney) {
			if(character.equalsIgnoreCase("mulan")) {
			continue;
			}else {
			System.out.print(character+" ");
		}
		
		
		}
	}
		
		
	}

}
