package quest3_package2.copy;

public class Character {
	private String name;
	private String type;
	private int health;
	private int power;
	private int magic;
	private int stealth;

	public int getStealth() {
		return stealth;
	}

	protected void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getMagic() {
		return magic;
	}

	protected void setMagic(int magic) {
		this.magic = magic;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	protected void setPower(int power) {
		this.power = power;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public int getHealth() {
		return health;
	}

	protected void setHealth(int health) {
		this.health = health;
	}

}
