package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10;
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
			}
		
		//print number 10 to 100
		System.out.println();
		
        int a =10;
        
        while(a<=100) {
        	System.out.print(a+" ");
        	a++;
        }
		
		// print number 10 to 1
        System.out.println();
        int b=10;
        while(b>=1) {
        	System.out.print(b+" "); 
        	b--;
        }
        
        //print number 100 to 50
		System.out.println();
		int c=100;
		while(c>=50){
			System.out.print(c+" ");
			c--;
		}
		System.out.println();
		int d=-1;
		while(d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		// print number from 1 to 20 only even numbers
		System.out.println();
		
		int e=2;
		while(e<=20) {
		System.out.print(e+" ");
		e+=2;
		}
		
		//2 ways
		System.out.println();
		int f=1;
		while(f<=20) {
			if(f%2==0) {
			System.out.print(f+" ");
		}
			f++;
		}
		System.out.println();
		int g=20;
		while(g<=100) {
			System.out.print(g+" ");
			g+=2;
		}
        System.out.println();
        int h=99;
        while(h>=1) {
        	System.out.print(h+" ");
        	h-=2;
        }
        
        
	}

}
