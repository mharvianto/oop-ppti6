package ppti.oop.menu;

public class StudentMenu extends Menu {

	public StudentMenu() {
		super("Student Menu", new String[] { "view course", "view detail score", "view summary score", "exit" });
	}

	@Override
	protected void initOperation() {
		addOperation(() -> {
			System.out.println("This is view course menu");
			in.nextLine();
		});
		addOperation(() -> {
			System.out.println("This is view detail score menu");
			in.nextLine();
		});
		addOperation(() -> {
			System.out.println("This is view summary score menu");
			in.nextLine();
		});
		addOperation(() -> {
			System.out.println("This is exit menu");
			in.nextLine();
		});
	}

}
