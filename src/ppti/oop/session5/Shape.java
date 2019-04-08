package ppti.oop.session5;

public abstract class Shape {
	
	protected int x;
	protected int y;
	
	public abstract double area();

	public static void main(String[] args) {
		Shape kotak = new Rectangle(10, 7);
		System.out.println(kotak.area());
		kotak = new Square(5);
		System.out.println(kotak.area());
		((Square)kotak).draw();
		kotak = new Shape() {
			@Override
			public double area() {
				return 1;
			}
		};
		System.out.println(kotak.area());
		if (kotak instanceof Shape) {
			System.out.println("turunan shape");
		}
	}

}
