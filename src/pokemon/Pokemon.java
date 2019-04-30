package pokemon;

import items.Iitem;

public class Pokemon {
	private Type type1, type2;
	private Iitem heldItem;
	private int nature, level, id, exp;
	private Stats baseStats, caculatedStats, EVs, IVs;
	
	public Stats calculateStats() throws Exception{
		
		if(baseStats!=null){
			throw new Exception("Pokemon not initialized");
		}else{
			Stats newStats = new Stats(0,0,0,0,0,0);
			//Checks if pokemon is not Shedinja
			if(id!=292){
				newStats.setHealth((((2*baseStats.getHealth()+IVs.getHealth()+(EVs.getHealth()/4)*level))/100)+level+10);
			}else{
				newStats.setHealth(1);
			}
			//TODO: Implement nature
			newStats.setDefence((((2*baseStats.getDefence()+IVs.getDefence()+(EVs.getDefence()/4)*level)/100)+5));
			newStats.setAttack((((2*baseStats.getAttack()+IVs.getAttack()+(EVs.getAttack()/4)*level)/100)+5));
			newStats.setSpeed((((2*baseStats.getSpeed()+IVs.getSpeed()+(EVs.getSpeed()/4)*level)/100)+5));
			newStats.setSpecialAttack((((2*baseStats.getSpecialAttack()+IVs.getSpecialAttack()+(EVs.getSpecialAttack()/4)*level)/100)+5));
			newStats.setSpecialDefence((((2*baseStats.getSpecialDefence()+IVs.getSpecialDefence()+(EVs.getSpecialDefence()/4)*level)/100)+5));
			
			return newStats;
			
		}
	}
	
	//TODO: calculate attack, attacks, items, etc
	
}
