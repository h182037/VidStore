package pull.up.before;

public class Paladin2 extends Character {
	
	private int health = 125;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public void healing() {
		health += 25;
	}

}