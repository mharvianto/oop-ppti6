import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String kata;
		Scanner in = new Scanner(System.in);
		kata = in.nextLine();
		boolean flag = true;
		int len = kata.length();
		for (int i = 0; i < len / 2; i++) {
			if (kata.charAt(i) != kata.charAt(len - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}

}
