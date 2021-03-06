package ppti.oop.menu;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
	protected Scanner in = new Scanner(System.in);
	private String title = null;
	private String[] menus = null;
	private ArrayList<Action> operations = new ArrayList<Action>();

	public Menu(String title, String[] menus) {
		this.title = title;
		this.menus = menus;
		initOperation();
		if (menus.length == operations.size())
			inputMenu();
	}

	protected abstract void initOperation();

	protected final void addOperation(Action op) {
		operations.add(op);
	}

	private final void inputMenu() {
		int input = 0;
		do {
			printMenu();
			try {
				input = in.nextInt();
			} catch (Exception e) {
				input = 0;
			}
			in.nextLine();
			if (0 < input && input <= operations.size()) {
				operations.get(input - 1).action();
			}
		} while (input != operations.size());
	}

	private final void printMenu() {
		clearScreen();
		System.out.println(title);
		int i = 1;
		for (String menu : menus) {
			System.out.println(i++ + ". " + menu);
		}
		System.out.print("Input: ");
	}

	private final void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
}
