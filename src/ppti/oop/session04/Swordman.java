package ppti.oop.session04;

public class Swordman extends Character {
	public Swordman() {
		super(1000, 50);
	}
	
	@Override
	public void skill() {
		System.out.println("ini swordman skill");
		hp += 200;
	}
	
	@Override
	public void skill2(Character enemy) {
		super.skill2(enemy);
		enemy.damage -= 5;
		this.hp += 100;
	}
}
