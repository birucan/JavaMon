package attacks;

import pokemon.Type;

public interface IAttack {
	
	public enum stats{
		attack,
		defense,
		speed,
		specialAttack,
		specialDefense
	}
	public enum StatusCondition{
		burn,
		freeze,
		paralysis,
		poison,
		sleep,
		badlyPoisoned,
		//others
		confusion,
		curse,
		embargo,
		encore,
		flinch,
		leechSeed,
		infatuation,
		nightmare,
		perishSong,
		taunt,
		torment,
		aquaRing,
		endure,
		//TODO
	}
	
	public int getDamage();
	public int getSpecificDamage();
	public int getRecoil();
	//0 yourself, 1 opponent 
	public int getTarget();
	public stats getStatsEffects();
	public int getStatsEffectsStages();
	//when an attack has multiple effects, it has a secondary attack where the properties of the other effects are stored 
	public IAttack getSecondAttack();
	public Type getType();
	public int getChance();
}
