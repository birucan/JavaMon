package pokemon;

import attacks.IAttack;
import items.Iitem;

public class Pokemon {
	private Type type1, type2;
	private Iitem heldItem;
	private int level, id, exp;
	private Nature nature;
	private Stats baseStats, caculatedStats, EVs, IVs;
	private IAttack[] attacks = new IAttack[4];
	
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

			newStats.setDefense((int) Math.floor(  (((2*baseStats.getDefense()+IVs.getDefense()+(EVs.getDefense()/4)*level)/100)+5)*nature.getDefense()  ));
			newStats.setAttack((int) Math.floor(   (((2*baseStats.getAttack()+IVs.getAttack()+(EVs.getAttack()/4)*level)/100)+5)*nature.getAttack()   ));
			newStats.setSpeed((int) Math.floor(   (((2*baseStats.getSpeed()+IVs.getSpeed()+(EVs.getSpeed()/4)*level)/100)+5)*nature.getSpeed()   ));
			newStats.setSpecialAttack((int) Math.floor(   (((2*baseStats.getSpecialAttack()+IVs.getSpecialAttack()+(EVs.getSpecialAttack()/4)*level)/100)+5)*nature.getSpecialAttack()   ));
			newStats.setSpecialDefense((int) Math.floor(   (((2*baseStats.getSpecialDefense()+IVs.getSpecialDefense()+(EVs.getSpecialDefense()/4)*level)/100)+5)*nature.getSpecialDefense()   ));
			
			return newStats;
			
		}
	}
	
	//TODO: calculate attack, attacks, items, etc
	
}
