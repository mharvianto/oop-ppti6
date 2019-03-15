package ppti.oop.session04;

public class Archer extends Character {
	public Archer() {
		super(800, 65);
	}
	
	@Override
	public void skill() {
		System.out.println("Archer skill");
		damage += 10;
	}
	
	@Override
	public void skill2(Character enemy) {
		enemy.hp -= (double)this.damage * 1.5;
	}
	
	public final void ulti(Character e) {
		super.skill();
	}
}
