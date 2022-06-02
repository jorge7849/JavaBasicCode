package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// if is a condition based statement 
		int day=3;
		String name;
		if(day==1) {
			name="monday";
		}else if(day==2) {
			name="tuesday";
		}else if(day==3) {
			name="wednesday";
			
		}else if(day==4) {
			name="thursday";
			
		}else if(day==5) {
			name="friday";
			
		}else if(day==6) {
			name="saturday";
			
		}else if (day==7) {
			name="sunday";
		}else {
			name="invalid";
		}
           System.out.println(name);
           System.out.println("-------------------------");
           //switch is a value based statement
           switch(day) {
           
           case 1:
        	   name="monday";
        	   break;
           case 2:
        	   name="tuesday";
        	   break; 
           case 3:
        	   name="wednesday";
        	   break;
           case 4:
        	   name="thursday";
        	   break;
           case 5:
        	   name="friday";
        	   break;
           case 6:
        	   name="saturday";
        	   break;
           case 7:
        	   name="sunday";
        	   break;
        	default:
        		name="invalid";
        		break;
        	   
      }
	System.out.println(name);
	}

}
