package ppti.oop.session04;

public class MainClass {

	public MainClass() {
		Character a = new Character();
		Swordman b = new Swordman();
		Character c = new Swordman();
		c = new Archer();

		a.skill();
		b.skill();
		c.skill();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		a.attack(b);
		b.attack(c);
		c.attack(a);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		b.skill2(a);
		c.skill2(b);
		a.skill2(c);
		if (c instanceof Object) {
			System.out.println("c instance dari object");
		}

		if (c instanceof Character) {
			System.out.println("c instance dari character");
		}

		if (c instanceof Archer) {
			System.out.println("c instance dari archer");
			Archer d = (Archer) c;
			d.ulti(a);
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		MainClass mc = new MainClass();
		try {
			MainClass a = (MainClass) mc.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
