package pokemon;

public class Stats {
	private int health, speed, attack, defence, specialAttack, specialDefence;

	
	
	public Stats(int health, int speed, int attack, int defence, int specialAttack, int specialDefence) {
		super();
		this.health = health;
		this.speed = speed;
		this.attack = attack;
		this.defence = defence;
		this.specialAttack = specialAttack;
		this.specialDefence = specialDefence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}

	public int getSpecialDefence() {
		return specialDefence;
	}

	public void setSpecialDefence(int specialDefence) {
		this.specialDefence = specialDefence;
	}
	
}
