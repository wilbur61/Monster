package my.monster.pkg;

public class StoneMonster extends Monster {
	public StoneMonster() {
		super.setName(null);
	}
	
	public StoneMonster(String name) {
		super.setName(name);
	}
	
	public String attack() {
		return "Attack with stone!";
	}
}