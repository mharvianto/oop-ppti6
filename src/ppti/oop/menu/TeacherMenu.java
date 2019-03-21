package ppti.oop.menu;

public final class TeacherMenu extends Menu {

	public TeacherMenu() {
		super("Teacher Menu", new String[] { "add Score", "exit" });
	}

	@Override
	public void initOperation() {
		addOperation(() -> {
			System.out.println("This is add Score Menu");
			in.nextLine();
		});
		addOperation(() -> {
			System.out.println("This is exit Menu");
			in.nextLine();
		});
	}

}
