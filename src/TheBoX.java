import java.util.Scanner;

public class TheBoX {

	static void box(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - j - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void circle(int n) {
		int r = n / 2;
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				int x = j - r, y = i - r;
				if (x * x + y * y <= r * r) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void print(String kata) {
		System.out.println(kata);
	}

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		box(n);
		circle(n);
		in.close();
	}

}
