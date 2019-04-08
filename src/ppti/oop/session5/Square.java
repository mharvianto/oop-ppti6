package ppti.oop.session5;

public class Square extends Shape{
	private double length;
	
	public Square(double length) {
		this.length = length;
	}

	@Override
	public double area() {
		return length * length;
	}
	
	public void draw() {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
