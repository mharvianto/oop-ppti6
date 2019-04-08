package ppti.oop.thread;

import java.util.Scanner;

public class MainClass {
	private Scanner in = new Scanner(System.in);
	private Printer[] printer = new Printer[10];
	
	public MainClass() {
		for (int i = 0; i < 10; i++) {
			String type;
			int count;
			System.out.println("Input type: ");
			type = in.nextLine();
			System.out.println("Input count: ");
			count = in.nextInt();
			in.nextLine();
			printer[i] = new Printer(type, count);
			new Thread(printer[i]).start();
		}
	}

	public static void main(String[] args) {
		new MainClass();
	}

}
