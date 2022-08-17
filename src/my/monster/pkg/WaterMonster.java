package my.monster.pkg;

public class WaterMonster extends Monster {
	public WaterMonster() {
		super.setName(null);
	}
	
	public WaterMonster(String name) {
		super.setName(name);
	}
	
	public String attack() {
		return "Attack with water!";
	}
}
