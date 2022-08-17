package my.monster.pkg;

public class Monster {
	private String name;
	
	public Monster() {
		name = null;
	}
	
	public Monster(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String attack() {
		return "!^_&amp;^$@+%$* I don't know how to attack!";
	}
}