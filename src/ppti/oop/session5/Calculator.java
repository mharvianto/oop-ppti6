package ppti.oop.session5;

public class Calculator {
	public static void main(String[] args) {
		BinaryOperator tambah = new BinaryOperator() {
			@Override
			public double operation(double a, double b) {
				return a + b;
			}
		};
		tambah = (a, b) -> a * b;
		
		System.out.println(tambah.operation(7, 5));
	}
}
