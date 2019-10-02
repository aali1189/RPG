
public class Character {

	static Dice dice = new Dice();
    String name;
    int strength, dexterity, intelligence, maxlife, currentlife, hp;

    static String compare[][] = new String[3][3];
    static String warriors[][] = new String[3][3];

     public Character() {
    	 warriors[0][0] = "Joe" ; 
         warriors[1][0] = "Bob";
         warriors[2][0] = "Adam";
     }
    public void comparing() {
    	for(int i =0;i<3; i++) {
    		for(int j =1; j<3;j++) {
    			if(Integer.parseInt(warriors[i][1])>Integer.parseInt(warriors[j++][1])) {
    				compare[i][0] = warriors[i][0];
    				compare[i][1] = warriors[i++][1];
    		 }
    	   }
    	}
    	
    	//for(int i =0; i<compare.length;i++) {
    		System.out.print(compare[2][0] + " | " +compare[2][1] + " Wins! \n");
    		//}
    }
    public Character(String n, int hp) {
      
    	
      for(int i =0; i<warriors.length; i++) {
    	  if(n.equals(warriors[i][0])) {
    		  warriors[i][1] = Integer.toString(hp);
    	  }
      }
      
    }
    
    
    public int attack() {
       
        return dice.roll();
    }
    
    
    public void damage(int damage, String name) {
    	
    	for(int i =0; i<warriors.length;i++) {
    		if(name.equals(warriors[i][0])) {
    			warriors[i][1] = Integer.toString(damage) ;
    			//System.out.println(warriors[i][0] + " | " +warriors[i][1] + " Damage is " + damage);
    		}
    	}
		
    }

    public void wound(int damage) {
        maxlife = currentlife - damage;
        
    }

    public void heal(int heal) {
        if(currentlife<maxlife){
            currentlife = currentlife + heal;
        }
        
    }
//name
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
//strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int s) {
        strength = s;
    }
//dexterity
    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int d) {
        dexterity = d;
    }
//intelligence
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int i) {
        intelligence = i;
    }
//current life(status)
    public void setCurrentlife() {
        currentlife = maxlife;
    }

    public int getCurrentLife() {
        return currentlife;
    }
//maxlife
    public void setMaxLife(int ml) {
        maxlife = ml;
    }

    public int getMaxLife() {
        return maxlife;
    }
	
	
	
	
	
}
