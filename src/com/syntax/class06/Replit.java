package com.syntax.class06;

import java.util.Scanner;
class Main {
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
    System.out.println("Is it sunny outside?");
  boolean isSunny=scan.nextBoolean();
  
  System.out.println("What is the temperature outside?");
  int temp=scan.nextInt();
  
  
  

  if(isSunny){
    System.out.println("It is a sunny day, I should go somewhere!");
    System.out.println("I am going to the beach");
  }else if(!isSunny){
    System.out.println("I stay home and practice Java");
  }

  


}
  


}


