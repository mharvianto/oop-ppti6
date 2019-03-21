package ppti.oop.session04;

public class Character {
	protected int hp;
	protected int damage;

	public Character() {
		hp = 0;
		damage = 0;
	}

	public Character(int hp, int damage) {
		this.hp = hp;
		this.damage = damage;
	}

	public void attack(Character enemy) {
		if (this.damage > enemy.hp)
			enemy.hp = 0;
		else
			enemy.hp -= this.damage;
	}

	public void skill() {
		System.out.println("Charater skill");
	}

	public void skill2(Character enemy) {
		System.out.println("Character skill2");
	}

	@Override
	public String toString() {
		return String.format("HP: %d\nDamage: %d", hp, damage);
	}
}
