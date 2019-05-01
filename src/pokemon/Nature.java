package pokemon;

public class Nature {
	private double attack=1, defense=1, speed=1, specialAttack=1, specialDefense=1;
	
	public void setNature(natures nature){
		switch(nature) {
		case HARDY:
			break;
		case LONELY:
			attack=1.1;
			defense=0.9;
			break;
		case BRAVE:
			attack=1.1;
			speed=0.9;
			break;
		case ADAMANT:
			attack=1.1;
			specialAttack=0.9;
			break;
		case NAUGHTY:
			attack=1.1;
			specialDefense=0.9;
			break;
		case BOLD:
			defense=1.1;
			attack=0.9;
			break;
		case DOCILE:
			break;
		case RELAXED:
			defense=1.1;
			speed=0.9;
			break;
		case IMPISH:
			defense=1.1;
			specialAttack=0.9;
			break;
		case LAX:
			defense=1.1;
			specialDefense=0.9;
			break;
		case TIMID:
			speed=1.1;
			attack=0.9;
			break;
		case HASTY:
			speed=1.1;
			defense=0.9;
			break;
		case SERIOUS:
			break;
		case JOLLY:
			speed=1.1;
			specialAttack=0.9;
			break;
		case NAIVE:
			speed=1.1;
			specialDefense=0.9;
			break;
		case MODEST:
			specialAttack=1.1;
			attack=0.9;
			break;
		case MILD:
			specialAttack=1.1;
			defense=0.9;
			break;
		case QUIET:
			specialAttack=1.1;
			speed=0.9;
			break;
		case BASHFUL:
			break;
		case RASH:
			specialAttack=1.1;
			specialDefense=0.9;
			break;
		case CALM:
			specialDefense=1.1;
			attack=0.9;
			break;
		case GENTLE:
			specialDefense=1.1;
			defense=0.9;
			break;
		case SASSY:
			specialDefense=1.1;
			speed=0.9;
			break;
		case CAREFUL:
			specialDefense=1.1;
			specialAttack=0.9;
			break;
		case QUIRKY:
			break;
		}
	}
	
	
	enum natures{
		HARDY,
		LONELY,
		BRAVE,
		ADAMANT,
		NAUGHTY,
		BOLD,
		DOCILE,
		RELAXED,
		IMPISH,
		LAX,
		TIMID,
		HASTY,
		SERIOUS,
		JOLLY,
		NAIVE,
		MODEST,
		MILD,
		QUIET,
		BASHFUL,
		RASH,
		CALM,
		GENTLE,
		SASSY,
		CAREFUL,
		QUIRKY
	}


	public double getAttack() {
		return attack;
	}


	public double getDefense() {
		return defense;
	}


	public double getSpeed() {
		return speed;
	}


	public double getSpecialAttack() {
		return specialAttack;
	}


	public double getSpecialDefense() {
		return specialDefense;
	}


	
	
}
