
//import java.util.Scanner;

public class TestCharacter {
	
	 public static void main(String[] args) {
		 
		 java.util.Scanner sc = new java.util.Scanner(System.in);
		 Character chararter = new Character();
	     String warrname = "";
		 int round = 3;
		 int hp=0;
		 int a = 0;
		 // Assigning hp
		 for(int i =0; i<3;i++) {
			  warrname = chararter.warriors[i][0];
				 System.out.print(warrname+"'s hp is ");
				 hp = sc.nextInt();
			  chararter = new Character(warrname, hp);
		 }
	

		 
		 
	      //Game
	        for(int i=0; i<=round; i++) {
	        	System.out.println("_________________________________________________");
	        //Assigning HP	
	        	String name = sc.next();
	        	System.out.print(name + ", who will attack? ");
	        	String worr = sc.next();
	        // Search
	        	for(int j=0; j<chararter.warriors.length; j++) {
	             if(worr.equals(chararter.warriors[j][0])) {
        	  	hp = Integer.parseInt(chararter.warriors[j][1]);
       			 }
	        	}

	        	//Attack 
	        	for(a = 0; a<chararter.dice.roll();a++) {
	        		hp--;
	        		
	        	}
	        	chararter.damage(hp, worr);
	        	    if(i > 2 ) {
	        	    	for(int l =0; l<chararter.warriors.length; l++) {
	        	    		System.out.println(chararter.warriors[l][0]+"'s hp is "+chararter.warriors[l][1]);
	        			}
	        	    	chararter.comparing();
	        	    	//Compare
	        	    	int t = 3;
	        
	        	    }else {
	        	    	System.out.println(name+" attacked " + worr +" for "+a+" damages");
	 	                System.out.println(worr+"'s current life is " +hp);
	 	              
	        	    
	 	                //round++;
	 	                //System.out.println(names[1][1]);
	        	    }
	        	   
	                
	        } //End game
//	    	              
//    
	        }
	 
		

		 
	

	 }
