package my.monster.pkg;

public class FireMonster extends Monster {
	public FireMonster() {
		super.setName(null);
		System.out.println("In FireMonster()==================<<<<");
	}
	
	public FireMonster(String name) {
		super.setName(name);
		System.out.println("FireMonster(String name)="+name);
	}
	
	public String attack() {
		return "Attack with fire!";
	}
}
